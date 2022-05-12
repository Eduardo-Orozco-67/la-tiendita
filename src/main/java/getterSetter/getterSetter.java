/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getterSetter;

public class getterSetter {
    //Clientes
    private static String nombre;
    private static String rfc;
    private static int telefono;
    private static String direccion;
    private static int id_cliente;
    
    //Compra_venta
    private static int id_venta;
    private static int fecha;
    private static float monto_final;
    
    //proveedor
    private static int id_proveedor;
    private static String rfc_p;
    private static String nombre_p;
    private static int telefono_p;
    private static String direccion_p;
    
    //Categoria
    private static int id_categoria;
    private static String nombre_c;
    private static String descripcion;
    
    //producto
    private static int id_producto;
    private static int num_barras;
    private static String nombre_producto;
    private static int anaquel;
    private static double precio;
    private static double descuento;
    private static int stock;
    
    //Detalles
    private static int consecutivo;
    private static int cantidad;
    private static double monto;
    

    public static int getId_cliente() {
        return id_cliente;
    }

    public static void setId_cliente(int id_cliente) {
        getterSetter.id_cliente = id_cliente;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        getterSetter.nombre = nombre;
    }

    public static String getRfc() {
        return rfc;
    }

    public static void setRfc(String rfc) {
        getterSetter.rfc = rfc;
    }

    public static int getTelefono() {
        return telefono;
    }

    public static void setTelefono(int telefono) {
        getterSetter.telefono = telefono;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        getterSetter.direccion = direccion;
    }

    public static int getId_venta() {
        return id_venta;
    }

    public static void setId_venta(int id_venta) {
        getterSetter.id_venta = id_venta;
    }

    public static int getFecha() {
        return fecha;
    }

    public static void setFecha(int fecha) {
        getterSetter.fecha = fecha;
    }

    public static float getMonto_final() {
        return monto_final;
    }

    public static void setMonto_final(float monto_final) {
        getterSetter.monto_final = monto_final;
    }

    public static int getId_proveedor() {
        return id_proveedor;
    }

    public static void setId_proveedor(int id_proveedor) {
        getterSetter.id_proveedor = id_proveedor;
    }

    public static String getRfc_p() {
        return rfc_p;
    }

    public static void setRfc_p(String rfc_p) {
        getterSetter.rfc_p = rfc_p;
    }

    public static String getNombre_p() {
        return nombre_p;
    }

    public static void setNombre_p(String nombre_p) {
        getterSetter.nombre_p = nombre_p;
    }

    public static int getTelefono_p() {
        return telefono_p;
    }

    public static void setTelefono_p(int telefono_p) {
        getterSetter.telefono_p = telefono_p;
    }

    public static String getDireccion_p() {
        return direccion_p;
    }

    public static void setDireccion_p(String direccion_p) {
        getterSetter.direccion_p = direccion_p;
    }

    public static int getId_categoria() {
        return id_categoria;
    }

    public static void setId_categoria(int id_categoria) {
        getterSetter.id_categoria = id_categoria;
    }

    public static String getNombre_c() {
        return nombre_c;
    }

    public static void setNombre_c(String nombre_c) {
        getterSetter.nombre_c = nombre_c;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public static void setDescripcion(String descripcion) {
        getterSetter.descripcion = descripcion;
    }

    public static int getId_producto() {
        return id_producto;
    }

    public static void setId_producto(int id_producto) {
        getterSetter.id_producto = id_producto;
    }

    public static int getNum_barras() {
        return num_barras;
    }

    public static void setNum_barras(int num_barras) {
        getterSetter.num_barras = num_barras;
    }

    public static String getNombre_producto() {
        return nombre_producto;
    }

    public static void setNombre_producto(String nombre_producto) {
        getterSetter.nombre_producto = nombre_producto;
    }

    public static int getAnaquel() {
        return anaquel;
    }

    public static void setAnaquel(int anaquel) {
        getterSetter.anaquel = anaquel;
    }

    public static double getPrecio() {
        return precio;
    }

    public static void setPrecio(double precio) {
        getterSetter.precio = precio;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        getterSetter.descuento = descuento;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        getterSetter.stock = stock;
    }

    public static int getConsecutivo() {
        return consecutivo;
    }

    public static void setConsecutivo(int consecutivo) {
        getterSetter.consecutivo = consecutivo;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        getterSetter.cantidad = cantidad;
    }

    public static double getMonto() {
        return monto;
    }

    public static void setMonto(double monto) {
        getterSetter.monto = monto;
    }
    
}
