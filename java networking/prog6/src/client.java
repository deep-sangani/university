
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deep
 */
public class client {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        
		DatagramSocket ds = new DatagramSocket();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string :");
		String str = s.nextLine();
		InetAddress ip = InetAddress.getByName("localhost");  
                

		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
		ds.send(dp); 
                
             
             byte [] buf = new byte[100];

        DatagramPacket dp1 = new DatagramPacket(buf, 100);

        ds.receive(dp1);

          String str1 = new String(dp.getData(), 0, dp.getLength());
          
          System.out.println(str1);

		ds.close();
    }
}