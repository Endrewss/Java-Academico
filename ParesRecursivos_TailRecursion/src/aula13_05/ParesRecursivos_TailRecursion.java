/*
4 - ("Aula13_05") Utilizando uma função recursiva, imprima os primeiros 
10 números pares a partir de um número qualquer 
informado pelo usuário.
 */
package aula13_05;

import java.util.Scanner;

public class ParesRecursivos_TailRecursion {

    public static void main(String[] args) {
        System.out.println("*** Contador recursivo de números pares ***");
        int contadorPares = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número inicial a partir do qual os pares serão gerados: ");
        int nroInicial = entrada.nextInt();
        // executa a rotina recursiva, passando os valores iniciais
        gerarParesRecursivamente(nroInicial, contadorPares);
    }
    
    public static void gerarParesRecursivamente(int numero, int qtdePares){
        // se não houver 10 pares, faz a recursão
        if (qtdePares < 10){
            // se o número for par (divisível por 2), exibe
            if (numero % 2 == 0){
                // sendo par, incrementa a quantidade de pares gerados
                qtdePares++;
                // exibe o número ordinal de par e o próprio número gerado
                System.out.println(String.format("%dº. par = %d", qtdePares, numero));
            }
            // executa a recursão
            gerarParesRecursivamente(numero + 1, qtdePares);
        }
    }
}
