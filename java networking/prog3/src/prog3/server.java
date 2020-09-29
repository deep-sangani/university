/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author deep
 */
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        
        while (true) {            
            
        DataInputStream din = new DataInputStream(s.getInputStream());
     String msg = (String)din.readUTF();
     
      
           System.out.println("client : "+msg);
           Scanner sc = new  Scanner(System.in);
        String msg1 = sc.nextLine();
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(msg1);
        
        }
       
        
        
        
        
        
       
       
    }
    
}
