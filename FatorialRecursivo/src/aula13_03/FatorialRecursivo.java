/*
2 - Com o auxílio de uma função recursiva, desenvolva um algoritmo ("Aula13_03") 
que calcule o fatorial de um número informado pelo usuário.
 */
package aula13_03;

import java.util.Scanner;

public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println("*** Fatorial Recursivo ***");
        // instancia objeto para leitura de valores do usuário
        Scanner entrada = new Scanner(System.in);
        // solicita valores ao usuário
        System.out.print("Informe um número para cálculo de seu fatorial: ");
        int nro = entrada.nextInt();
        // executa a função de geração de número fatorial
        int nroFatorial = calcularFatorialRecursivamente(nro);
        // exibe o número fatorial gerado
        System.out.println(String.format("Fatorial de %d é %d.", nro, nroFatorial));
    }

    private static int calcularFatorialRecursivamente(int nro) {
        if (nro <= 0)
            return 1;
        else
            return nro * calcularFatorialRecursivamente(nro - 1);
    }
}
