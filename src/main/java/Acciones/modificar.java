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
      
      public void modificarCategoria(String Nombre, String Descripcion, int id) {
        
        try {
            st = conexion.createStatement();
            String sql = "update Categoria set Nombre='" + Nombre +"',Descripcion='" + Descripcion + "' where id_categoria =" + id+ "; ";
            st.executeUpdate(sql);
            st.close();
            
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      public void modificarproveedor(int id, String Nombre, String rfc, long telefono, String direcc) {
        
        try {
            st = conexion.createStatement();
            String sql = "update proveedor set rfc='" + rfc +"',nombre='" + Nombre + "',telefono='" + telefono + "',direccion='" + direcc + "' where id_proveedor ='" + id + "'; ";
            st.executeUpdate(sql);
            st.close();
            
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
       public void modificarproducto(int id,int num_barras, int id_proveedor, int id_categoria, String nombre, int anaquel, double precio, double descuento, int stock, String fecha) {
        
        try {
            st = conexion.createStatement();
            String sql = "update producto set num_barras='" + num_barras +"',id_proveedor='" + id_proveedor +"',id_categoria='" + id_categoria +"',nombre='" + nombre +"',anaquel='" + anaquel +"',precio='" + precio +"',descuento='" + descuento +"',stock='" + stock +"',fecha='" + fecha +"' where id_producto =" + id +";";
            st.executeUpdate(sql);
            st.close();
           
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      
      
      
}
