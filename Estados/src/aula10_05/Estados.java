/*
4 - Faça um programa (Aula10_05) que apresente ao usuário os nomes dos estados da 
região sudeste do Brasil. Solicite ao usuário que escolha um estado ou a opção 0
para sair; a partir disso, faça a seguinte validação: enquanto esse valor não for 
um valor válido (ou seja, um dos estados ou o número 0), permaneça solicitando
algum valor. Após o usuário informar um valor correto, apresente a capital desse
estado (utilizando um switch para fazer a escolha) - ou encerre, se a opção for 0.
 */
package aula10_05;

import java.util.Scanner;

public class Estados {

    public static void main(String[] args) {
        int opcaoEstado = 0;
        Scanner sc = new Scanner(System.in);
        // apresenta menu até que o usuário informe um valor válido
        do {
            System.out.println("*** Escolha um estado do Brasil *** ");
            System.out.println("Digite:\n1 - Espírito Santo\n2 - Minas Gerais\n" +
                    "3 - Rio de Janeiro\n4 - São Paulo\n '0' para sair...");
            opcaoEstado = sc.nextInt();
        }while(opcaoEstado < 0 || opcaoEstado > 4); 
        
        // a partir da entrada do usuário, utiliza o 'switch' para exibir a capital
        switch(opcaoEstado){
            case 1: System.out.println("ES - Vitória."); break;
            case 2: System.out.println("MG - Belo Horizonte."); break;
            case 3: System.out.println("RJ - Rio de Janeiro."); break;
            case 4: System.out.println("SP - São Paulo."); break;
            default: System.out.println("Programa finalizado. Obrigado.");
        }
    }
}
