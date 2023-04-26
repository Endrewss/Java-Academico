/*
2 - Em um novo projeto (Aula10_03), solicite um número inteiro ao usuário (de 2 
a 9) e, utilizando um "for", calcule sua tabuada e imprima todos os valores na 
tela. Porém, caso o número não esteja dentro do invervalo esperado, solicite
novamente o número ao usuário até que a condição (número entre 2 e 9) seja atendida.
 */
package aula10_03;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        System.out.println("*** Tabuada ***");
        
        // instancia objeto para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);
        int nro = 0;
        
        // solicita número ao usuário, repetindo a solicitação 
        // caso o número não seja válido
        do {
            System.out.print("Informe um número de 2 a 9 para cálculo da tabuada: ");
            nro = sc.nextInt();
            // verifica se o número está
            if (nro < 2 || nro > 9){
                System.out.println("Número inválido.");
            }
        }
        while(nro < 2 || nro > 9);
        
        // executa laço para calcular e exibir a tabuada do número informado
        for (int i = 1; i <= 10; i++){
            // System.out.println(nro + " x " + i + " = " + (nro * i));
            System.out.println(String.format("%d x %d = %d", nro, i, (nro * i)));
        }
    }
}
