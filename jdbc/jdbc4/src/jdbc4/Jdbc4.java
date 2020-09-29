/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc4;

import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author deep
 */

//create procedure EMPSALARY (in id int,out salary int) begin select salary into salary from emp where id=id; end$$

public class Jdbc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
         // Drivrt registration
        Class.forName("com.mysql.jdbc.Driver");
        //get connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
          // create statement
           
            
           //exicute statement
            CallableStatement stmt=conn.prepareCall("call INSERTEMP(3,'yash',70000)");  
            stmt.execute();
            System.out.println("inserted successfully");
            
            
            CallableStatement stmt2=conn.prepareCall("{call EMPSAL(?,?)}");  
          stmt2.setInt(1, 1);
          stmt2.registerOutParameter(2, Types.INTEGER);
        stmt2.executeUpdate();
        System.out.println(stmt2.getInt(2));
  
            
         
    }
    
}
