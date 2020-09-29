/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author deep
 */
public class Jdbc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
 
            Statement stmt = conn.createStatement();
            
           
            // diplay record
        ResultSet rs =   stmt.executeQuery("select * from student");
        
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
        }
          // insert record
          
        stmt.execute("insert into student values(1112,'john','main street 4')");

            System.out.println("inserted successfully");
        
        
        //update record
          stmt.executeUpdate("update student set name='yashn' where enroll=3056");
       
            System.out.println("updated successfully");
        
         //delete record
          stmt.executeUpdate("delete from student where enroll=1112");
       
            System.out.println("updated successfully");
            
              ResultSet rs1 =   stmt.executeQuery("select * from student");
        
        while(rs1.next()){
            System.out.println(rs1.getInt(1));
            System.out.println(rs1.getString(2));
             System.out.println(rs1.getString(3));
        }
        
        
       conn.close();
            
    }
    
}
