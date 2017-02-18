package gui.atualizahost;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique
 */
public class AtualizaHost {

   
    public static void localHost() throws UnknownHostException{
        
        //Buscando o IP do localhost;
        InetAddress localhost = InetAddress.getByName("localhost");
        //Buscando hostname
        InetAddress servidor = InetAddress.getLocalHost();
        ConectaServidor conecta = new ConectaServidor();

    }
    public void gravaHosts(String servidor, String IP) throws IOException{
        String hosts = "C:/windows/system32/drivers/etc/hosts";
//        String hosts = "/home/henrique/hosts";
        
        String temp = hosts + ".tmp";
        BufferedReader original = new BufferedReader(new FileReader(hosts));
        copy(new File(hosts), new File(temp));
        
        try (BufferedWriter arq = new BufferedWriter(new FileWriter(temp))) {
            boolean contem = false;
            String linha;
            String alvo = servidor + ".iconeweb.com.br";
            Window.jTextPaneMensagens.setText(
                Window.jTextPaneMensagens.getText() + "\nAtualizando as informações "
                        + "no arquivo hosts.");
            while ((linha = original.readLine()) != null) {
                if (linha.contains(alvo)) {
                    linha = linha.replace(linha, IP + "\t" + servidor + ".iconeweb.com.br\n");
                    arq.write(linha);
                    contem = true;
                    break;
                } else {
                    arq.write(linha + "\n");
                }
                
            }
            if (!contem){
                arq.append(IP + "\t" + servidor + ".iconeweb.com.br\n");
            }
            original.close();
            arq.close();
            
//        System.out.println("gravou o arquivo temp");
       
        new File(hosts).delete();
//        System.out.println("deletou o arquivo hosts");
        new File(temp).renameTo(new File(hosts));
        
//         Window.jTextPaneMensagens.setText("Arquivo salvo.");
//            System.out.println("Atualizado informações no arquivo hosts.");
//        System.out.println("Renomeou o arquivo temp para hosts");
        }
        

    }
   
      void copy(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst); 
        
        // Transferindo bytes de entrada para saída
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }
    /**
     * Testes para gração de arquivo
     * @param args 
     */
    public static void main(String[] args) {
        AtualizaHost atl = new AtualizaHost();
        try {
            atl.gravaHosts("nutrikao", "255.456.55.270");
        } catch (IOException ex) {
            Logger.getLogger(AtualizaHost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}