/*
3 - Escreva um programa (Aula10_04) que receba 2 números inteiros quaisquer. 
Utilizando um laço de repetição, imprima todos os números ímpares existentes entre eles. 
 */
package aula10_04;

import java.util.Scanner;

public class ImparesComLaco {

    public static void main(String[] args) {
        int nroMenor = 0, nroMaior = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("*** Programa para impressão de números ímpares ***");
        // recebe os 2 valores do usuário
        System.out.print("Informe o menor número: ");
        nroMenor = leitor.nextInt();
        System.out.print("Informe o maior número: ");
        nroMaior = leitor.nextInt();
        
        // exibe mensagem informativa
        System.out.println("Exibindo todos os números ímpares entre " + nroMenor + " e " + nroMaior + ":");
        // utilizano um "for", percorre todos os números entre o 
        // menor e o maior informados pelo usuário
        for (int i = nroMenor; i <= nroMaior; i++){
            // verifica se o número é ímpar; se for, imprime-o
            if (i % 2 == 1)
                System.out.println(i);
        }
    }
    
}
