/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones; 

import Connection.Conecction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Emili
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
      
      
      
      public void modificarCliente(String nombre, int telefono, String direccion, String rfc)
      {
        try
        {
            st=conexion.createStatement();
            String sql ="update cliente set nombre ='"+nombre+"', telefono = '"+telefono+"', direccion = '"+direccion+"' where rfc = '"+rfc+"';";//Sentencia sql
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

      }
      
}
