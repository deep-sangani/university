/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deep
 */
@WebServlet(urlPatterns = {"/serve"})
public class serve extends HttpServlet {

  
   

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try (PrintWriter out = response.getWriter()) {
       String name=    request.getParameter("name");
     
       
       if(name.equals("deep")){
           RequestDispatcher rd = request.getRequestDispatcher("serve2");
           rd.forward(request, response);
       }
       else{
           out.println("u type wrong name >>>>");
       }
        }
    }

  

}
