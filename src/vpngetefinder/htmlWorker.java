/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vpngetefinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sinri
 */
public class htmlWorker {
    public static String seekURL(String theURL,String code) throws MalformedURLException{
        StringBuilder SRC=new StringBuilder();
        URL myurl=new URL(theURL);
        BufferedReader r =null;
        try{
            r= new BufferedReader(new InputStreamReader(myurl.openStream(),code));
            while(true) {
                int i=r.read();
                if (i==-1) break;
                else {
                    char c=(char)i;
                    //Charset.availableCharsets()
                    SRC.append(c);
                }
            }
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(htmlWorker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(htmlWorker.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                r.close();
            } catch (IOException ex) {
                Logger.getLogger(htmlWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return SRC.toString();
    }
    
    public static String seekURL(String theURL) throws MalformedURLException{
        return htmlWorker.seekURL(theURL, "UTF-8");
    }
    
    public static String seekURL2(String theURL){
        DatagramPacket inPacket;
        InetAddress sAddr;
        byte[] inBuffer=new byte[1024];
        StringBuilder SRC=new StringBuilder();
        //TODO fulfill this
        try{
            DatagramSocket dSocket=new DatagramSocket();
            sAddr=InetAddress.getByName(theURL);
            
        } catch (SocketException ex) {
            Logger.getLogger(htmlWorker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(htmlWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SRC.toString();
    }
}
