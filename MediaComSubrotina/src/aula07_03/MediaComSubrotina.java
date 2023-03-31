package aula07_03;

import java.util.Scanner;

public class MediaComSubrotina {

    public static void main(String[] args) {
        // programa para cálculo de média
        float media, p1, p2;
        
        System.out.println("*** Programa para cálculo de média (com subrotina) ***");
        
        // instancia objeto para receber dados do usuário
        Scanner entrada = new Scanner(System.in);
        // recebe dados do usuário
        System.out.print("Nota da P1: ");
        p1 = entrada.nextFloat();
        System.out.print("Nota da P2: ");
        p2 = entrada.nextFloat();
        // calcula a média
//        media = (p1 + p2) / 2;
        
        // executa subrotina que calcula a média entre 2 valores passados como parâmetros
        media = calcularMedia(p1, p2);
        
        // verifica se o aluno foi aprovado, se precisará de P3 ou se está reprovado
        if (media >= 6){
            System.out.println("Aluno aprovado diretamente com média " + media);
        }
        else if (media >= 2){
            // informa que o aluno precisará de uma nota complementar
            System.out.print("Aluno em exame. Informe nota de P3: ");
            float p3 = entrada.nextFloat();
            // calcula nova média
            // media = (media + p3)/2;
            
            // executa subrotina que calcula a média entre 2 valores passados como parâmetros
            media = calcularMedia(media, p3);
            
            // faz novo teste para verificar se aluno foi aprovado em P3 ou não
            if (media >= 6){
                System.out.println("Aluno aprovado em exame com média " + media);
            }
            else{
                System.out.println("Aluno reprovado em exame com média " + media);
            }
        }
        else {
            System.out.println("Aluno reprovado diretamente com média " + media);
        }
    }
    
    public static float calcularMedia(float nota1, float nota2){
        float mediaFinal = 0;
        // calcula média
        mediaFinal = (nota1 + nota2) / 2;
        
        // retorna o resultado da média
        return mediaFinal;
    }
    
}
