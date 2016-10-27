
package ArquivoLog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogArquivo {
    File arquivo;
    FileReader fileReader;
    BufferedReader bufferedReader;
    FileWriter fileWriter;
    BufferedWriter bufferedWriter;  
    
public LogArquivo(String erros) {
    escreverLog(erros);
}

private void escreverLog(String erros){
    arquivo=new File("Exceptions.log");
        try {
            arquivo=new File("Exceptions.log");
            fileReader =new FileReader(arquivo);
            bufferedReader= new  BufferedReader (fileReader);
            Vector texto=new Vector();
        try {
            while(bufferedReader.ready()){
              texto.add(bufferedReader.readLine());
            }
            fileWriter=new FileWriter(arquivo);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (int i=0;i<texto.size();i++){
                bufferedWriter.write(texto.get(i).toString());
                bufferedWriter.newLine();
            }
            
            bufferedWriter.write(erros);
            bufferedReader.close();
            bufferedWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LogArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (FileNotFoundException ex) {
        try {
            arquivo.createNewFile();
            escreverLog(erros);
        } catch (IOException ex1) {
            System.exit(0);
        }
        }
    catch (IOException er){
        System.exit(0);
    }
} 

}