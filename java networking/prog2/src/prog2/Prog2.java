/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author deep
 */
public class Prog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        URL url = new URL("https://marwadiuniversity.ac.in");
        
        URLConnection uconn = url.openConnection();
        InputStream is = uconn.getInputStream();
        int i;
        while((i=is.read())!=-1){
            System.out.print((char)i);
        }
    }
    
}
