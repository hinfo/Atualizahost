package con.atualizahost;

import gui.atualizahost.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author henrique
 */
public class AtualizaHost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        //Buscando o IP do localhost;
        InetAddress localhost = InetAddress.getByName("localhost");
        //Buscando hostname
        InetAddress servidor = InetAddress.getLocalHost();
        ConectaServidor conecta = new ConectaServidor();
        
        String server = "nutrikao";
        String msg = conecta.leIp(server);

        System.out.println(msg);
    }
}