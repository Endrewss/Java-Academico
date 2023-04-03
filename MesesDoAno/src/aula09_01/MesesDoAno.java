/*
1 - Escreva um programa ("Aula09_01") que solicite um número ao usuário; 
utilizando um "switch", informe qual é o mês equivalente. Caso o usuário
informe um número inválido, avise-o de que não há mês correspondente ao número 
digitado.
 */
package aula09_01;

import java.util.Scanner;

public class MesesDoAno {

    public static void main(String[] args) {
        
        System.out.println("*** Programa para verificação do mês digitado (com Switch) ***");
        
        // instancia objeto para receber dados do usuário
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número de 1 a 12 (correspondente a um mês do ano): ");
        int mes = sc.nextInt();

        System.out.print("\nO número informado corresponde a ");
        // exibe o mês correspondente
        switch(mes){
            case 1: System.out.println("Janeiro"); break;
            case 2: System.out.println("Fevereiro"); break;
            case 3: System.out.println("Março"); break;
            case 4: System.out.println("Abril"); break;
            case 5: System.out.println("Maio"); break;
            case 6: System.out.println("Junho"); break;
            case 7: System.out.println("Julho"); break;
            case 8: System.out.println("Agosto"); break;
            case 9: System.out.println("Setembro"); break;
            case 10: System.out.println("Outubro"); break;
            case 11: System.out.println("Novembro"); break;
            case 12: System.out.println("Dezembro"); break;
            default: System.out.println("uma opção inválida: não há mês correspondente à opção digitada.");
        }
    }
}
