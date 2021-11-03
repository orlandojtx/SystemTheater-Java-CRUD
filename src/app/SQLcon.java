/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author ORLANDO
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

public class SQLcon {
    
    Connection conectar=null;
    
    public Connection conexion() 
            
    {       
        String dbURL ="jdbc:mysql://localhost:3306/reto5";
        String username = "root";
        String password = "Orlandojose1.mysql";
       
try{
    conectar=DriverManager.getConnection(dbURL, username, password);
    
       if (conectar != null ) {
//        System.out.println ("Conectado");

//      JOptionPane.showMessageDialog(null,"Successful connection", "Connection", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
catch ( SQLException ex) 
{
//    JOptionPane.showMessageDialog(null,"Failed connnection","Connection", JOptionPane.INFORMATION_MESSAGE);

    ex.printStackTrace ();
}
return conectar;
 }







}




    
