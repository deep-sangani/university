/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5;

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
    public static void main(String[] args) throws IOException {
          
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        
                  
            
        DataInputStream din = new DataInputStream(s.getInputStream());
     String str = (String)din.readUTF();
     	
	int countc = 0,countn = 0; 
	for(int i=0;i<str.length();i++)
	{
		if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
			countc++;
		else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			countn++;
	}
        
           
          String msg1 = "total no : "+ countn + "  total char :"+countc ;
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(msg1);
    }
}

