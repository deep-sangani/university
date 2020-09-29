/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author deep
 */
public class Jdbc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        // TODO code application logic here
        
         Class.forName("com.mysql.jdbc.Driver");
        //get connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        
        con.setAutoCommit(false);  
  
PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
while(true){  
  
System.out.println("Enter enroll: ");  
String s1=br.readLine();  
int enroll=Integer.parseInt(s1);  
  
System.out.println("Enter name: ");  
String name=br.readLine();  
  
System.out.println("Enter address: ");  
String add=br.readLine();  
  
ps.setInt(1,enroll);  
ps.setString(2,name);  
ps.setString(3,add);  
ps.executeUpdate();  
  
System.out.println("commit/rollback");  
String answer=br.readLine();  
if(answer.equals("commit")){  
con.commit();  
} else if(answer.equals("rollback")){  
con.rollback();  
}
System.out.println("Want to add more records y/n");  
String ans=br.readLine();  
if(ans.equals("n")){  
break;  
}  
  
}  
//con.commit();  
System.out.println("record successfully saved");  
  
con.close();//before closing connection commit() is called  
    }
 
    }

    

