
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deep
 */
@WebServlet(urlPatterns = {"/db"})
public class db extends HttpServlet {

   
 

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //database connected
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            out.println("database connected<br/>");
            Statement stmt = conn.createStatement();
            
            // create database
            
            stmt.executeUpdate("CREATE DATABASE if not exists school");
            out.println("database created successfully<br/>");
            
            // create table
            stmt.executeUpdate("DROP TABLE IF EXISTS student");
            stmt.executeUpdate("CREATE table student(id int(3),name varchar(20),address varchar(50))");
             out.println("table created successfully<br/>");
             
            // insert record
            
            stmt.executeUpdate("insert into student values(1,'deep','main road')");
            out.println("record inserted successfully<br/>");
            
            // update record
            
            stmt.executeUpdate("UPDATE student SET name='yash' where id=1");
            out.println("record updated successfully<br/>");
            
            //delete record
            stmt.executeUpdate("DELETE FROM student where id=1");
            out.println("record deleted successfully<br/>");
            
            //delete table
            stmt.executeUpdate("DROP TABLE student");
            out.println("table deleted successfully<br/>");
            
            //delete database
            
            stmt.executeUpdate("DROP DATABASE school");
            out.println("database deleted successfully<br/>");
            
            
            conn.close();
            
            
            
            
            
            
            
            
        } catch (Exception ex) {
            out.println(ex);
        }
        
        

    }
}
