/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author deep
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         Socket s = new Socket("localhost",3000);
        
        System.out.println("enter msg ");
                 
            Scanner sc = new  Scanner(System.in);
        String msg = sc.nextLine();
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(msg);
        
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        String msg2 =(String)din.readUTF();
        System.out.println(msg2);
    
    }
}
    
