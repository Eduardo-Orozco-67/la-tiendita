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
}