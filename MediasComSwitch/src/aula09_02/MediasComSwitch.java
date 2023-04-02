/*
2 - Escreva um programa ("Aula09_02") que permita ao usuário informar a quantidade de 
valores que ele deseja utilizar para calcular uma determinada média; a quantidade 
pode ser de 2, 3 ou 4 números. Receba a quantidade de números de acordo com a 
quantidade informada e, utilizando "switch", calcule a média entre estes números.
 */
package aula09_02;

import java.util.Scanner;

public class MediasComSwitch {

    public static void main(String[] args) {
        
        System.out.println("*** Programa para cálculo de médias ***");
        
        // solicita ao usuário que informa quantos valores para o cálculo da média
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a quantidade de números para "
                + "cálculo de média (entre 2 e 4): ");
        int qtdeNumeros = leitor.nextInt();
        
        
        // valida se os números estão no intervalo esperado
        if (qtdeNumeros < 2 || qtdeNumeros > 4){
            System.out.println("Quantidade informada fora do intervalo (2 a 4).");
            return;
        }
        
        float valor1, valor2, valor3, valor4, media;
        System.out.print("Valor 1: ");
        valor1 = leitor.nextFloat();
        System.out.print("Valor 2: ");
        valor2 = leitor.nextFloat();
        // como todas as opções receberão "valor1" e "valor2", faz uma primeira 
        // parte do cálculo (no caso, a soma antes da divisão)
        media = valor1 + valor2;
        
        // verifica, via switch, se é necessário receber mais valores
        switch(qtdeNumeros){
            case 3:
                System.out.print("Valor 3: ");
                valor3 = leitor.nextFloat();  
                // soma esse novo número à somatória anterior
                media += valor3;
                break;
            case 4:
                System.out.print("Valor 3: ");
                valor3 = leitor.nextFloat();  
                // soma esse novo número à somatória anterior
                media += valor3;
                System.out.print("Valor 4: ");
                valor4 = leitor.nextFloat();  
                // soma esse novo número à somatória anterior
                media += valor4;
                break;
        }
        
        // calcula, de fato, a média entre a somatória e a quantidade de valores solicitados
        media /= qtdeNumeros;
        
        // exibe a média calculada
        System.out.println(String.format("Média entre os números informados: %.2f", media));

    }
}
