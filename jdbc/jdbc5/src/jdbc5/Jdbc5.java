/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author deep
 */
public class Jdbc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
         Class.forName("com.mysql.jdbc.Driver");
        //get connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
      Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
ResultSet rs=stmt.executeQuery("select * from emp ");  
  

rs.absolute(1);  
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
  
conn.close();  
    }
    
}
