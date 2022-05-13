/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

/**
 *
 * @author Emili
 */

import Connection.Conecction;
import getterSetter.getterSetter;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Buscar {    
    Statement st;
    ResultSet res;
    Connection conexion;
    //Connection cone = null;
    
    public Buscar(){
        Conecction c = new Conecction();
        conexion = c.conectar();
    }
    
     public Buscar (Connection conexion){
        this.conexion = conexion;
    }
    
    public String [] ID_cliente(){
        String sql = "select id_cliente from cliente order by id_cliente ASC;";
        String []x = new String[1];
        try{
           st=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           res=st.executeQuery(sql);
           res.last();
           int filas = res.getRow();
           res.beforeFirst();
           x = new String[filas];
           filas = 0;
           while(res.next()){
               x[filas]=res.getString("ID_cliente");
               filas++;
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return x;
    }
    
     //Buscar el ID d la venta
    public String [] ID_venta(){
        String sql = "select id_venta from compra_venta order by id_venta ASC;";      
        String []x = new String[1];
        try{
           st=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);   
           res=st.executeQuery(sql);
           res.last();
           int filas = res.getRow();
           res.beforeFirst(); 
           x = new String[filas];
           filas = 0;
           while(res.next()){
               x[filas]=res.getString("ID_venta");     
               filas++;
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return x;
    }
      
     public String [] verCliente(String id_cliente){
        String sql = "select * from cliente where id_cliente = "+id_cliente+" ;";      
        String []x = new String[4];
        try{
           st=conexion.createStatement();   
           res=st.executeQuery(sql);
           while(res.next())
           {
               x[0]=res.getString("nombre");
               x[1]=res.getString("rfc");
               x[2]=res.getString("telefono");
               x[3]=res.getString("direccion");
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return x;
    }
    
    public String[] vermonto(String id_venta){        
        String sql = " select monto_final from compra_venta where id_venta = "+id_venta+";";
        String []x=new String[3];
        try{
           st=conexion.createStatement(); 
           res=st.executeQuery(sql);
           while(res.next()){
               x[0]=res.getString("monto_final");               
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return x;
    }
    
    //BiPO 
    //Busqueda de la categoría
    public void mostrar(String nombre_c) {
        try {
    java.sql.Statement st;
    ResultSet rs;
    getterSetter var = new getterSetter();

            st = conexion.createStatement();
            String sql = "select * from categoria where nombre='" + nombre_c + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var.setId_categoria(rs.getInt("ID_Categoria"));
                var.setNombre_c(rs.getString("Nombre"));
                var.setDescripcion(rs.getString("Descripcion"));
            } else {
                var.setId_categoria(0);
                var.setNombre("");
                var.setDescripcion("");
                JOptionPane.showMessageDialog(null, "no se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en programa " + e, "Error de sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}