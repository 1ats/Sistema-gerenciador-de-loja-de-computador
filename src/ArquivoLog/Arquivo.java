/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArquivoLog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    
    public static void escrever(String mensagem, String logFile) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em questao.
        FileWriter fileWriter = new FileWriter(logFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        bufferedWriter.write(msg);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    
    public static String ler(String mensagem) throws IOException {
         FileReader fileReader = new FileReader(mensagem);
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         String linha = "";
         while (bufferedReader.ready()) {
             linha += bufferedReader.readLine();
             //System.out.println(linha);
         }

         bufferedReader.close();
         return linha;
     }
}
