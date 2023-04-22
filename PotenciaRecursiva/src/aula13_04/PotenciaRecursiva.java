/*
3 - Com uma função recursiva, faça um programa ("Aula13_04") para calcular a 
potência de um número informado pelo usuário (a partir de um expoente também 
informado pelo usuário).

Nota: lembrar que 5³ ==> 5 * 5 * 5.

*/
package aula13_04;

import java.util.Scanner;

public class PotenciaRecursiva {

    public static void main(String[] args) {
        System.out.println("*** Potência com Recursividade ***");
        // instancia objeto para leitura de valores do usuário
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor da base: ");
        int base = entrada.nextInt();
        System.out.print("Informe o valor da expoente: ");
        int expoente = entrada.nextInt();
        // executa função recursiva que multiplica a base por ela própria (tantas
        // quantas forem as vezes determinadas pelo expoente)
        int potencia = calcularPotenciaRecursivamente(base, expoente);
        System.out.println(String.format("%d elevado a %d = %d.", base, expoente, potencia));
    }
    
    public static int calcularPotenciaRecursivamente(int base, int exp){
        switch (exp) {
            case 0: return 1; 
            case 1: return base;
            default: return base * calcularPotenciaRecursivamente(base, exp - 1);
        }
    }
}
