/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package con.atualizahost;

import gui.atualizahost.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

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
}
