/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.atualizahost;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author henrique
 */
public class JSONRW {
		public static String nome;
		public static String alias;
		public static String ip;
                
    public void criarArquivo(String servidor, String alias, String IP) throws IOException{
        //Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();
		
		FileWriter writeFile = null;
		
		//Armazena dados em um Objeto JSON
		jsonObject.put("nome", servidor);
		jsonObject.put("alias", alias);
		jsonObject.put("ip", IP);// na primeira atualização troca
		
		try{
			writeFile = new FileWriter("vpn_ini.json");
			//Escreve no arquivo conteudo do Objeto JSON
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//Imprimne na Tela o Objeto JSON para vizualização
		System.out.println(jsonObject);
                Window.jTextPaneMensagens.setText("Arquivo criado com sucesso");

	

    }
    public void leArquivo(String nomeArquivo){
        JSONObject jsonObject;
		//Cria o parse de tratamento
		JSONParser parser = new JSONParser();
		//Variaveis que irao armazenar os dados do arquivo JSON

		try {
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader(
					nomeArquivo));
			
			//Salva nas variaveis os dados retirados do arquivo
			nome = (String) jsonObject.get("nome");
			alias = (String) jsonObject.get("alias");
                        ip = (String) jsonObject.get("ip");
                        
                        Window.jTextFieldServer.setText(nome);
                        

			System.out.printf(
					"Servidor: %s\nAlias: %s\n",
					nome, alias);
		} 
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
