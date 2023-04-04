/*
2 - Faça um programa  ("Aula04_03") que, utilizando o Scanner, solicite dois 
números quaisquer ao usuário e, a partir disso, realize as 4 operações
aritméticas básicas, armazenando cada um dos resultados numa variável 
diferente. Ao final, imprima o resultado de cada operação.
 */
package aula04_03;

import java.util.Scanner;

public class OperacoesAritmeticas {

    public static void main(String[] args) {
        // declara variável para receber dados do usuário
        float valor1, valor2;
        System.out.println("*** Calculadora básica ***");
        // declara e instancia objeto Scanner para leitura de valores via teclado
        Scanner entrada = new Scanner(System.in);
        // solicita entrada de valores ao usuário
        System.out.print("Informe o primeiro valor: ");
        valor1 = entrada.nextFloat();
        System.out.print("Informe o segundo valor: ");
        valor2 = entrada.nextFloat();
        
        // realiza as operações aritméticas básicas
        float adicao = valor1 + valor2;
        float subtracao = valor1 - valor2;
        float multiplicacao = valor1 * valor2;
        float divisao = valor1 / valor2;
        
        // apresenta os resultados das operações
        System.out.println("Resultados...");
        System.out.println("Soma: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
