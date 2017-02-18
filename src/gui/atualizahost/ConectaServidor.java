/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.atualizahost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author henrique
 */
public class ConectaServidor {
    
    public String leIp(String server) throws MalformedURLException, IOException{
    
     String url = "http://www.iconeweb.com.br/cgi-bin/leip.sh?"+ server;
     URL servidor = new URL(url);
     
     BufferedReader in = new BufferedReader(
            new InputStreamReader(servidor.openStream()));
            String host = in.readLine();
     
      String[] ip = host.split(":");
     return ip[0].toString();
    }
    public void ping(String IP)
         throws UnknownHostException, IOException {
    String ipAddress = IP;
    InetAddress inet = InetAddress.getByName(ipAddress);
    Window.jTextPaneMensagens.setText("Testando conexão com o servidor para o ip " + ipAddress);
    
    
    Window.jTextFieldStatus.setText(inet.isReachable(5000) ? "Conexão ativa!" : "Sem conexão");

   }
    public static boolean isReachableByPing(String host) {
    try{
            String cmd = "";
            if(System.getProperty("os.name").startsWith("Windows")) {   
                    // For Windows
                    cmd = "ping -n 1 " + host;
            } else {
                    // For Linux and OSX
                    cmd = "ping -c 1 " + host;
            }

            Process myProcess = Runtime.getRuntime().exec(cmd);
            myProcess.waitFor();

            if(myProcess.exitValue() == 0) {

                    return true;
            } else {

                    return false;
            }

    } catch( Exception e ) {

            e.printStackTrace();
            return false;
    }
}
}
