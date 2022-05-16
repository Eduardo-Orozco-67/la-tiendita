
-- Procedimiento almacenado para guardar productos en una venta

drop procedure IF Exists GuardarDetalle (IN vidventa INTEGER, IN vbarras INTEGER, IN vcant INTEGER, INOUT pRes INTEGER);

CREATE PROCEDURE GuardarDetalle (IN vidventa INTEGER, IN vbarras INTEGER, IN vcant INTEGER, INOUT pRes INTEGER) AS $$
	DECLARE 
		vidventa alias for $1;
        vbarras alias for $2;
		vcant alias for $3;
		vreg record;
        vreg1 record;
		vmonto numeric;
        vdesc numeric;
        vprod numeric;
		vban integer;
	BEGIN
		-- Selecciona la venta 
		Select into vreg * from compra_venta where id_venta = vidventa for update;
		--Entra si la venta existe
		IF FOUND THEN
			-- Si la venta existe busca el producto usando el numero de barras
            Select into vreg1 * from producto where num_barras = vbarras for update;
            iF FOUND THEN
                -- Validar que la cantidad ingresada sea igual o menor a la del stock del producto 
                IF vcant < vreg1.stock THEN
                    --calcular el descuento por el producto 
                    vdesc:= ((vreg1.precio * vcant) * (vreg1.descuento)); -- (20*2) * 0.1 = 4 obtenemos el descuento                 
                    --calcular el monto por todas las unidades del producto
                    vmonto:= (vreg1.precio * vcant) - vdesc;  --40-4=36 

                    --Disminuir el stock  
                    vreg1.stock:= vreg1.stock - vcant;
                    --Actualizar el stock del producto (tabla producto)
                    update producto set stock = vreg1.stock where num_barras = vbarras ; 
                    --Aumentar el monto final sumandole el monto por los productos iguales (tabla venta)
                    vreg.monto_final:= vreg.monto_final + vmonto;
                    update compra_venta set monto_final = vreg.monto_final where id_venta = vidventa ;
                    --insertar el detalle
                    insert into detalles (ID_venta, ID_producto, cantidad, monto) values (vidventa, vreg1.ID_producto, vcant, vmonto);
                    vban := 1; 
                    Commit;
                ELSE                
                    vban:= 0;
                    Rollback;
                END IF;
                    pRes := vban;
            END IF;
            pRes := vban;
		END IF;
			pRes := vban;	
    END;
    $$ LANGUAGE plpgsql;

--Llamado del PL
Call GuardarDetalle (id_venta, num_barras, cantidad);
Call GuardarDetalle (1, 12345, 2, NULL);

--Prueba insertando datos
--Ingresar un cliente
insert into cliente values ('1', 'Mario Lopez', 'MMM54', 96265784, 'centro');
--insertar una venta
insert into compra_venta values (1, 1, '10-05-2022', 0);
--insertar proveedor
insert into proveedor values(1, 'PR555', 'Gustavo Gonzalez', 962458712, 'laureles');
--insertar categoria
insert into categoria (nombre, descripcion) values ('abarrotes', 'abasteciendo el hogar');
--insertar producto
insert into producto (num_barras, ID_proveedor, ID_categoria, nombre, anaquel, precio, descuento, stock) values (12345, 1, 1, 'aceite', 5, 20, 0.1, 5);
insert into producto (num_barras, ID_proveedor, ID_categoria, nombre, anaquel, precio, descuento, stock) values (12346, 1, 1, 'galletas', 7, 26, 0.1, 10);

insert into producto (num_barras, ID_proveedor, ID_categoria, nombre, anaquel, precio, descuento, stock) values (12347, 1, 1, 'refresco', 7, 30, 0.1, 15);
insert into producto (num_barras, ID_proveedor, ID_categoria, nombre, anaquel, precio, descuento, stock) values (12348, 1, 1, 'dulce', 6, 28, 0.1, 10);

--Restauracion de datos
update producto set stock = 5 where id_producto = 2;
update compra_venta set monto_final = 0 where id_venta = 1;
delete from detalles;


--modificar tablas de detalle y prodcuto
drop table producto cascade;

create table Producto (
    ID_producto integer not null,
    num_barras integer not null,
    ID_proveedor integer not null,
    ID_categoria integer not null,
    nombre varchar not null,
    anaquel integer not null, 
    precio numeric not null,
    descuento numeric not null,
    stock integer not null,
    CONSTRAINT producto_pkey primary key (ID_producto),
    CONSTRAINT producto_prov_fkey foreign key (ID_proveedor) references Proveedor (ID_proveedor),
    CONSTRAINT producto_categ_fkey foreign key(ID_categoria)
	references Categoria (ID_categoria) match simple on update no action on delete cascade
);


drop table detalles cascade;

create table detalles (
    ID_venta integer not null,
    ID_producto integer not null,
    consecutivo integer not null,
    cantidad integer not null,
    monto numeric not null,
    CONSTRAINT detalles_pkey primary key (ID_venta, consecutivo),
    CONSTRAINT detalles_venta_fkey foreign key(ID_venta)
	references Compra_Venta (ID_venta) match simple on update no action on delete cascade,
    CONSTRAINT detalles_producto_fkey foreign key(ID_producto) 
	references Producto (ID_producto) match simple on update no action on delete cascade
); 

--Agregar la secuencia a las dos tablas 

create sequence producto_num_producto;
create sequence detalle_cns;

ALTER TABLE producto
ALTER COLUMN ID_producto
SET DEFAULT NEXTVAL('producto_num_producto');

ALTER TABLE detalles
ALTER COLUMN consecutivo
SET DEFAULT NEXTVAL('detalle_cns');


--------------------------------------------------------------------------------------------------------------------- DEVOLUCION DEL PRODUCTO 

Call GuardarDetalle (id_venta, num_barras, cantidad);
Call Devolucion (1, 12345, 2, NULL);    

drop procedure Devolucion;
CREATE PROCEDURE Devolucion (IN vidventa INTEGER, IN vbarras INTEGER, IN vcant INTEGER, INOUT pRes INTEGER) AS $$
	DECLARE 
		vidventa alias for $1;
        vbarras alias for $2;
		vcant alias for $3;
		vreg record;
        vreg1 record;
		vmonto numeric;
        vdesc numeric;
        vprod numeric;
		vban integer;
	BEGIN
		-- Selecciona la venta 
		Select into vreg * from compra_venta where id_venta = vidventa for update;
		--Entra si la venta existe
		IF FOUND THEN
			-- Si la venta existe busca el producto usando el numero de barras
            Select into vreg1 * from producto where num_barras = vbarras for update;
            iF FOUND THEN
                --calcular el descuento por el producto
                vdesc:= ((vreg1.precio * vcant) * (vreg1.descuento)); -- (20*2) * 0.1 = 4 obtenemos el descuento                 
                --calcular el monto por todas las unidades del producto
                vmonto:= (vreg1.precio * vcant) - vdesc;  --40-4=36 
                --Aumentar el stock  
                vreg1.stock:= vreg1.stock + vcant;
                --Actualizar el stock del producto (tabla producto)
                update producto set stock = vreg1.stock where num_barras = vbarras ; 
                --Disminuir el monto final restando el monto por los productos iguales (tabla venta)
                vreg.monto_final:= vreg.monto_final - vmonto;
                update compra_venta set monto_final = vreg.monto_final where id_venta = vidventa ;
                --borrar el detalle
                delete from detalles where id_venta = vidventa and id_producto = vreg1.id_producto;
                vban := 1; 
                Commit;
            ELSE                
                vban:= 0;
                Rollback;
            END IF;
            pRes := vban;
	    END IF;
		    pRes := vban;	
    END;
    $$ LANGUAGE plpgsql;