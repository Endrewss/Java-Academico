/*
1 - Faça um programa ("Aula04_02") que contenha uma variável onde esteja armazenado 
o ano atual. Usando Scanner, solicite ao usuário um ano de nascimento qualquer e 
informe a idade calculada (desconsiderando mês e dia).
*/

package aula04_02;

import java.util.Scanner;

public class CalculoIdade {

    public static void main(String[] args) {
        // variáveis que serão utilizadas no calculo
        int anoAtual = 2023, anoNascimento, idade;

        System.out.println("*** Programa para cálculo de idade ***");
        // declara e instancia objeto para leitura de dados informados via teclado
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe seu ano de nascimento: ");
        anoNascimento = leitor.nextInt();
        // faz o cálculo da idade, desconsiderando meses e dias
        idade = anoAtual - anoNascimento;
        // exibe o resultado para o usuário
        System.out.println("Sua idade é de " + idade + " anos (desconsiderando meses e dias).");
    }
    
}
