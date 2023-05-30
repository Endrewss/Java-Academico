/*
6 - ("Aula12_07") Utilizando apenas "UM" vetor (e, no máximo, 3 variáveis), 
armazene 10 valores recebidos do usuário; após armazenar todos os valores, 
apresente-os na tela. Em seguida, inverta a posição desses valores e, ao 
final, apresente-os invertidos.

Por exemplo:
valores iniciais do vetor[] = {2, 3, 9, 10}
valores invertidos = {10, 9, 3, 2}
 */
package aula12_07;

import java.util.Scanner;

public class VetorInvertido {

    public static void main(String[] args) {
        int vet[] = new int[10];
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("*** Programa para inversão de vetor ***");

        // recebe 10 valores quaisquer do usuário
        for (int i = 0; i < vet.length; i++){
            System.out.print(
                String.format(
                    "Informe um número qualquer para a posição '%d': ", (i+1)));
            vet[i] = leitor.nextInt();
        }
        
        System.out.println("\n");
        
        System.out.println("Apresenta valores na posição original: ");
        for (int i = 0; i < vet.length; i++){
            System.out.println(String.format("vet[%d] = %d", i, vet[i]));
        }
        
        // cria variável auxiliar para armazenar os valores temporariamente
        int aux = 0;
        // faz lógica para inverter vetor
        for (int i = 0, j = vet.length-1; i < vet.length/2; i++, j--){
            // armazena o valor da primeira posição na variável auxiliar
            aux = vet[i];
            // copia o valor da última posição para a primeira
            vet[i] = vet[j];
            // transfere o valor da "aux" para a última
            vet[j] = aux;
        }
        
        System.out.println("\n");
        
        System.out.println("Apresenta valores na ordem inversa: ");
        for (int i = 0; i < vet.length; i++){
            System.out.println(String.format("vet[%d] = %d", i, vet[i]));
        }
        
    }
}
