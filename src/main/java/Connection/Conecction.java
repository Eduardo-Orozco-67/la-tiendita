/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author <Eduardo Orozco eduardo.orozco66@unach.mx>
 */
public class Conecction {

    Connection con = null;
    

    //variables para guardar los datos de acceso a la bd
    private final String url = "jdbc:postgresql://localhost:5432/la_tiendita";
    private final String usuario = "postgres";
    private final String contraseña = "samuel117";

    //metodo para conectar la bd, es una clase de tipo Connection 
    public Connection conectar() {
        try {
            //manejo del Driver
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("BD CONECTADA");
        } catch (ClassNotFoundException | SQLException e) {
            //excepcion sql
            JOptionPane.showMessageDialog(null, "Error en su conexion " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    public Statement getConexion(){
        Statement stmt =null;
        return stmt;
    }

    public static void main(String args[]) throws SQLException {
        Conecction c = new Conecction();
        c.conectar();
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
