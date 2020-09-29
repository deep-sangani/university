/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author deep
 */
public class Prog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
     InetAddress inet = InetAddress.getByName("www.google.com");
     
        System.out.println(inet.getHostAddress());
    }
    
}
