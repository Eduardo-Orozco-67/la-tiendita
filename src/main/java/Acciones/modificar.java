/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base; 

import Connection.Conecction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author erwin.bermudez
 */
public class modificar {
    Connection conexion;
    Conecction c = new Conecction();
    Statement st;
    ResultSet rs;
    
    public modificar(){
        conexion=c.conectar();
    }
     //venta, barras, cantidad producto
      public int actualizardetalle(int idventa, int barras, int cant){
        String sql="update detalles set num_barras = "+barras+", cantidad = "+cant+" where id_venta = "+idventa+";"; 
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
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
        return respuesta;
    }
}
