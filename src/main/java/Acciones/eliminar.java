
package Acciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Connection.Conecction;
import java.sql.SQLException;

/**
 *
 * @author telmex
 */
public class eliminar {
    
    Conecction c = new Conecction();
    Statement st; //Para uso de sentencia Sql
    Connection conexion;
    
    public void eliminarClientes(int ID_cliente)
    {
        try{
            st=conexion.createStatement();
            String sql= "Delete from cliente where id_cliente = '"+ID_cliente+"' ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Eliminacion fallida");
        }
    }
    
}
