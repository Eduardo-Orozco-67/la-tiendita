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
public class Guardar_producto {    
    Conecction c = new Conecction();
    Statement st; //Para uso de sentencia Sql
    Connection conexion;
    //Connection con = null;
    
    //Constructor de la clase 
    public Guardar_producto(){
        conexion = c.conectar();
    }
    
    //Metodo que se manda a llamar para insertar datos
    /* public int GuardarVenta(int idCombo, int barras, int cant){
        //Sentencia de SQL para insertar los datos
        String sql = "Call GuardarDetalle("+idCombo+", "+barras+", "+cant+");"; // "+null+"
        boolean respuesta=true;                                                                                                                       
        try{
            st = conexion.createStatement();
            respuesta=st.execute(sql);
            System.out.println(respuesta);
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
    }  */  
     
        public int guardard(int idCombo, int barras, int cant){
        String sql="Call GuardarDetalle("+idCombo+", "+barras+", "+cant+");";
        int respuesta=0;
        try{
            st=conexion.createStatement();
            respuesta=st.executeUpdate(sql);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respuesta;
    }
}