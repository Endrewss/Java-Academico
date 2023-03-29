
package aula15_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipulaArquivos {

    public static void main(String[] args) {
        System.out.println("*** Programa para leitura e escrita de arquivo ***");

        // manipular arquivos fisicos na maquina
        File objArquivo = new File("meuArquivo.txt");
        
        try{
            System.out.println("Cria arquivo fisico na maquina");
            // tenta criar o arquivo
            objArquivo.createNewFile();
            
            // instancia objeto (objEscritorArquivo) capaz de escrever em arquivos (representado pelo objeto objArquivo)
            System.out.println("Cria objeto para gravar em arquivo.");
            FileWriter objEscritorArquivo = new FileWriter(objArquivo);
            
            // instancia objeto (objBufferDeEscrita) para armazenar (em buffer) conteudo a ser escrito no arquivo
            System.out.println("Cria objeto para armazenar em buffer o conteudo a ser escrito.");
            BufferedWriter objBufferDeEscrita = new BufferedWriter(objEscritorArquivo);
            
            // instancia objeto (objEscritor) que envia caracteres ao buffer, para depois envia-los ao arquivo
            System.out.println("Cria objeto que escreve no arquivo.");
            PrintWriter objEscritor = new PrintWriter(objBufferDeEscrita, true);
            
            // imprime conteudos no buffer
            objEscritor.println("Endrews Nunes de Azevedo");
            objEscritor.println("E.N.A");
            objEscritor.println("Sexta, 01/11/2002");
            
            System.out.println("Conteúdo escrito com sucesso.");
        }
        catch(Exception ex){
            System.out.println("Erro ao manipular arquivo para gravar valores.\n" + ex.toString());
        }
        
        // bloco de try..catch para leitura de conteúdo do arquivo
        try{
            // instancia objeto (objLeitorArquivo) capaz de ler conteúdos do arquivo (representado pelo objeto objArquivo)
            System.out.println("Cria objeto para ler do arquivo.");
            FileReader objLeitorArquivo = new FileReader(objArquivo);
            
            // instancia objeto (objBufferDeLeitura) para armazenar (em buffer) conteudo lido do arquivo
            System.out.println("Cria objeto para armazenar, em buffer, o conteudo lido do arquivo.");
            BufferedReader objBufferDeLeitura = new BufferedReader(objLeitorArquivo);
            
            // comando para ler conteúdo do arquivo
            String conteudoLido = "";
            // lógica para leitura do conteúdo: enquanto o buffer de leitura estiver "ready", 
            // significa que há conteúdo a ser lido; com isso, continua no laço
            while(objBufferDeLeitura.ready()){
                // lê conteúdo e o armazena em uma variável (para ser exibido de uma única vez)
                conteudoLido += objBufferDeLeitura.readLine() + "\n";
            }
            System.out.println("Conteúdo lido: ");
            // exibe o conteúdo recuperado do arquivo
            System.out.println(conteudoLido);
            
        }
        catch(Exception ex){
            System.out.println("Erro ao manipular arquivo para ler valores.\n" + ex.toString());
        }
        
    }
    
}
