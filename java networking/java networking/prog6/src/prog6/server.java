/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author deep
 */
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException {
        // TODO code application logic here
        
        try{
DatagramSocket ds = new DatagramSocket(3000);
byte [] buf = new byte[100];

DatagramPacket dp = new DatagramPacket(buf, 100);

ds.receive(dp);

String str = new String(dp.getData(), 0, dp.getLength());

int carcount =0,countno = 0;

for(int i =0;i<str.length();i++)
{
	if(str.charAt(i)>='a'&&str.charAt(i)<='z')
		carcount++;
	if(str.charAt(i)>='0'&&str.charAt(i)<='9')
		countno++;
}
    
           
        String str2 = "no of char : "+ carcount+" no of no : "+ countno;
        
    DatagramPacket dp1 = new DatagramPacket(str2.getBytes(), str2.length(), dp.getAddress(), dp.getPort());
     ds.send(dp1);
        }catch(IOException e){
    
}
    }
}

