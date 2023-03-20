package aula07_01;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        System.out.println("*** Estrutura Condicional ***");

        int valor1, valor2;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o 1º valor: ");
        valor1 = leitor.nextInt();

        System.out.print("Informe o 2º valor: ");
        valor2 = leitor.nextInt();

        System.out.println("\n");

        if (valor1 == valor2) {
            System.out.println("valor1 == valor2");
        } else if (valor1 != valor2) {
            System.out.println("valor1 != valor2");
        }

        if (valor1 > valor2) {
            System.out.println("valor1 > valor2");
        } else if (valor1 < valor2) {
            System.out.println("valor1 < valor2");
        } else {
            System.out.println("valor1 <= valor2");
        }
    }
}
