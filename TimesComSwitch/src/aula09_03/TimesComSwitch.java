/*
3 - ("Aula09_03") Solicite ao usuário que informe qual seu time predileto, 
dentre os 4 maiores de seu estado, e dê mensagens "cordiais" aos torcedores dos 
times diferentes do seu. Utilize o "switch" para escolher entre as mensagens de 
cada time. Valide se o time não constar na lista (opção "default").

Requisito: para gerar a saudação ao usuário, utilize uma subrotina com a assinatura abaixo:
          --->> public static String gerarSaudacaoTorcedor(int time)

PS: se quiser, pode substituir 4 opções de time por 4 opções de ator, filme, 
escritor, livro, série, game etc.
 */
package aula09_03;

import java.util.Scanner;

public class TimesComSwitch {

    public static void main(String[] args) {
        
        System.out.println("*** Times Com Switch ***");
        
        int codigoTime;
        // instancia objeto para receber dados do usuário
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o time que você torce:\n" +
                "1 - Corinthians\n2 - Palmeiras\n3 - Santos\n4 - São Paulo");
        codigoTime = sc.nextInt();
        // executa sub-rotina que irá elaborar mensagem e retorná-la na sequência
        String msgSaudacao = gerarSaudacaoTorcedor(codigoTime);
        // exibe mensagem gerada de acordo com o time informado
        System.out.println(msgSaudacao);
    }
    
    public static String gerarSaudacaoTorcedor(int time){
        String msg = "";
        // de acordo com time escolhido, retorna uma mensagem específica
        switch(time){
            case 1: msg = "Corinthians: um dia vai pagar o estádio?"; break;
            case 2: msg = "Palmeiras: Mundial, rs?"; break;
            case 3: msg = "Santos: belo jardim na orla."; break;
            case 4: msg = "São Paulo: Tricampeão do Mundo!!"; break;
            default: msg = "Time desconhecido.";
        }
        return msg;
    }
}
