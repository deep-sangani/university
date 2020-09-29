/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author deep
 */
public class Jdbc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
 
          PreparedStatement stmt=conn.prepareStatement("select * from student");  
          ResultSet rs=stmt.executeQuery();  
           
            // diplay record
      
        
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
        }
          // insert record
          
      PreparedStatement stmt1=conn.prepareStatement("insert into student values(?,?,?)"); 
      stmt1.setInt(1,12);
      stmt1.setString(2, "rutvik");
      stmt1.setString(3, "main street 22");

            System.out.println("inserted successfully");
        
        
        //update record
        PreparedStatement stmt2=conn.prepareStatement("update student set name=? where enroll=?");  
       stmt2.setString(1, "rutvik2");
       stmt2.setInt(2,12);
       
            System.out.println("updated successfully");
        
         //delete record
        PreparedStatement stmt3=conn.prepareStatement("delete from student where enroll=?");  
         stmt3.setInt(1, 3055);
            System.out.println("updated successfully");
            
              ResultSet rs1=stmt.executeQuery(); 
        
        while(rs1.next()){
            System.out.println(rs1.getInt(1));
            System.out.println(rs1.getString(2));
             System.out.println(rs1.getString(3));
        }
        
        
       conn.close();
            
    }
    
}
