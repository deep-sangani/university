/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
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
     
        
        Socket s = new Socket("localhost",3000);
        
        System.out.println("enter file ");
                 
            Scanner sc = new  Scanner(System.in);
        String filename = sc.nextLine();
        
        File file = new File("/"+filename);
        FileReader fread = new FileReader(file);
       
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
     
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        String msg2 =(String)din.readUTF();
        System.out.println("server : "+msg2);
        
        }
       
    }
    

