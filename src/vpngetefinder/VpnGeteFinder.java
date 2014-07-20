/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vpngetefinder;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sinri
 */
public class VpnGeteFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String host = "imap.126.com";
            String port = "143";
            String email = "XX@126.com";
            String password = "xx";
            if (args.length == 4) {
                host = args[0];
                port = args[1];
                email = args[2];
                password = args[3];
            }
            if (args.length == 2) {
                email = args[0];
                password = args[1];
            } else {
                Logger.getLogger(VpnGeteFinder.class.getName()).log(Level.INFO, "Usage: \nVpnGeteFinder [IMAP_HOST PORT] MAIL PASSWORD \nIMAP_HOST is imap.126.com as default \nPORT is 143 as default");
            }

            imapWorker.receive(host, port, email, password);
        } catch (Exception ex) {
            Logger.getLogger(VpnGeteFinder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
