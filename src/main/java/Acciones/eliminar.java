
package Acciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Connection.Conecction;
import java.awt.HeadlessException;
import java.sql.SQLException;

/**
 *
 * @author telmex
 */
public class eliminar {
    
     private final Conecction c = new Conecction();
    
    Statement st; //Para uso de sentencia Sql
    Connection conexion;
    
    public void eliminarClientes(int ID_cliente)
    {
        try{
            Connection conexiion = c.conectar();
            st=conexiion.createStatement();
            String sql= "Delete from cliente where id_cliente = "+ID_cliente+" ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Eliminacion fallida");
        }
    }
    
     public void eliminarproveedor(String rfcwe)
    {
          try {
            Connection conexiion = c.conectar();
            st=conexiion.createStatement();
            String sql= "DELETE FROM proveedor WHERE rfc ='"+rfcwe+"';";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            //mensajes de eliminacion
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public void eliminarcategoria(int id_categoria){
        try {
            Connection conexiion = c.conectar();
            st=conexiion.createStatement();
            String sql= "delete from categoria where id_categoria="+id_categoria+"; ";
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error",JOptionPane.ERROR_MESSAGE);
        }
          
        }
     
     public void eliminarproducto(String nom)
    {
          try {
            Connection conexiion = c.conectar();
            st=conexiion.createStatement();
            String sql= "DELETE FROM producto WHERE nombre ='"+nom+"';";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            //mensajes de eliminacion
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
