/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Connection.Conecction;
import java.sql.SQLException;

/**
 *
 * @author Emili
 */
public class Guardar_venta {    
    Conecction c = new Conecction();
    Statement st; //Para uso de sentencia Sql
    Connection conexion;
    //Connection con = null;
    
    //Constructor de la clase 
    public Guardar_venta(){
        conexion = c.conectar(); 
    }
    
    /*public boolean guardarproducto(int idcombo, int barras, int cant){
        String sql="Call GuadarDetalle("+idcombo+","+barras+","+cant+", "+null+");";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            //System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }*/
    
    
    public boolean guardarventa(int id_cliente, String fecha, int monto_final){ 
        String sql="insert into compra_venta (id_cliente, fecha, monto_final) values("+id_cliente+",'"+fecha+"',"+monto_final+");";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            //System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
    
    public void guardarClientes(String nombre,String rfc,long telefono,String direccion)
    {
        try{
            st=conexion.createStatement();
            String sql="insert into cliente(nombre, RFC, telefono, direccion) values('"+nombre+"', '"+rfc+"', '"+telefono+"', '"+direccion+"');";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro fallido");
        }
    }
    
    public boolean guardaproveedor(String rfc, String nombre,long telefono,String direccion)
    {
        String sql="insert into proveedor (rfc, nombre, telefono, direccion) values('"+rfc+"','"+nombre+"', '"+telefono+"', '"+direccion+"');";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro exitoso", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Registro fallido " + e, "mensaje", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                st.close();
            }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "Registro fallido " + e, "mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
        return !respuesta;
    }
    
    public boolean guardaproducto(int num_barras, int id_proveedor, int id_categoria, String nombre, int anaquel, double precio, double descuento, int stock, String fecha, int stock_inicial )
    {
        String sql="insert into producto(num_barras,id_proveedor,id_categoria,nombre,anaquel,precio,descuento,stock,fecha,stock_inicial) values('"+num_barras+"','"+id_proveedor+"', '"+id_categoria+"', '"+nombre+"','"+anaquel+"','"+precio+"','"+descuento+"','"+stock+"','"+fecha+"','"+stock_inicial+"');";
        boolean respuesta = true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro exitoso", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Registro fallido " + e, "mensaje", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                st.close();
            }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "Registro fallido " + e, "mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
        return !respuesta;
    }
    
     public void guardarCategoria(String Nombre, String Descripcion)
    {
         try {
            
            st = conexion.createStatement();
            String sql = "insert into categoria (nombre, descripcion) values('" + Nombre + "','" + Descripcion + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    
    }   
}