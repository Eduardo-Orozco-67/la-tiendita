--Crear base de datos en SQL
create database la_tiendita 

--Conectarse a la base de datos
\c la_tiendita

--Creacion de tablas 
create table Cliente (
    ID_cliente integer,
    nombre varchar not null,
    RFC varchar not null,
    telefono bigint not null,
    direccion varchar not null,
    CONSTRAINT cliente_pkey PRIMARY KEY (ID_cliente)
); 

create table Compra_Venta (
    ID_venta integer,
    ID_cliente integer not null,
    Fecha date not null constraint fecha_invalida check (fecha >= now()),
    monto_final float not null,
    CONSTRAINT compra_venta_pkey primary key (ID_venta),
    CONSTRAINT compra_venta_fkey foreign key (ID_cliente) references Cliente (ID_cliente)
);

create table Proveedor (
    ID_proveedor integer not null, 
    RFC varchar not null,
    nombre varchar not null,
    telefono bigint not null,
    direccion varchar,
    CONSTRAINT Proveedor_pkey primary key (ID_proveedor)
);

create table Categoria (
    ID_categoria integer not null,
    nombre varchar not null,
    descripcion varchar not null,
    CONSTRAINT Categoria_pkey primary key (ID_categoria)
);

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
    fecha  date not null,
    stock_inicial integer,
    CONSTRAINT producto_pkey primary key (ID_producto),
    CONSTRAINT producto_prov_fkey foreign key (ID_proveedor) references Proveedor (ID_proveedor),
    CONSTRAINT producto_categ_fkey foreign key(ID_categoria)
	references Categoria (ID_categoria) match simple on update no action on delete cascade
);

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

--Agregar la secuencia a las tablas
create sequence cliente_id_cliente;
create sequence compra_venta_id_venta;
create sequence proveedor_id_prov;
create sequence categoria_id_categ;
create sequence producto_num_producto;
create sequence detalle_cns;

ALTER TABLE cliente
ALTER COLUMN ID_cliente
SET DEFAULT NEXTVAL('cliente_id_cliente');

ALTER TABLE compra_venta
ALTER COLUMN id_venta
SET DEFAULT NEXTVAL('compra_venta_id_venta');

ALTER TABLE proveedor
ALTER COLUMN ID_proveedor
SET DEFAULT NEXTVAL('proveedor_id_prov');

ALTER TABLE categoria
ALTER COLUMN ID_categoria
SET DEFAULT NEXTVAL('categoria_id_categ');

ALTER TABLE producto
ALTER COLUMN ID_producto
SET DEFAULT NEXTVAL('producto_num_producto');

ALTER TABLE detalles
ALTER COLUMN consecutivo
SET DEFAULT NEXTVAL('detalle_cns');

