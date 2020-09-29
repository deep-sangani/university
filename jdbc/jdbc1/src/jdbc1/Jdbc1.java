/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author deep
 */
public class Jdbc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Drivrt registration
        Class.forName("com.mysql.jdbc.Driver");
        //get connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
          // create statement
            Statement stmt = conn.createStatement();
            
           //exicute statement
            
            stmt.executeUpdate("CREATE DATABASE if not exists school");
          
            
    }
    
}
