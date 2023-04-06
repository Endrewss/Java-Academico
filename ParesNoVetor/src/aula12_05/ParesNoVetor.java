/*
4 - Faça um programa ("Aula12_05") que receba um número qualquer do usuário. Este 
número deverá ser passado como argumento a uma função chamada "retornar10Pares". 
Esta função deverá retornar, num vetor, os 5 números pares abaixo e os 5 números 
pares acima do número informado. Na função "main", obtenha esse vetor de 10 
posições e imprima cada um dos números informados.

Assinatura da função: 
public static int[] retornar10Pares(int nroDoMeio);
 */
package aula12_05;

import java.util.Scanner;

public class ParesNoVetor {

    public static void main(String[] args) {
        System.out.println("*** 5 primeiros e ultimos Pares no vetor ***");
        Scanner sc = new Scanner(System.in);
        // lê um número do usuário para gerar os pares acima e abaixo dele
        System.out.print("Informe um número qualquer: ");
        int nro = sc.nextInt();
        // declara vetor para receber o vetor com os 10 pares gerados
        int vetPares[] = new int[10];
        // recupera o retorno do método e exibe cada valor armazenado
        vetPares = retornar10Pares(nro);
        // faz laço para ler e exibir os números armazenados
        System.out.println("Números pares gerados: ");
        for (int i = 0; i < vetPares.length; i++){
            System.out.println(vetPares[i]);
        }
    }
    
    public static int[] retornar10Pares(int nroDoMeio){
        int vetorTemp[] = new int[10];
        int nroAuxiliar = nroDoMeio - 10;
        // faz laço para calcular 10 números pares     
//        for (int contadorPares = 0; contadorPares < vetorTemp.length; contadorPares++, nroAuxiliar++){
        for (int contadorPares = 0; contadorPares < vetorTemp.length; contadorPares++){
            // se o valor de "nroAuxiliar" for par, armazena-o no vetor
            if (nroAuxiliar % 2 == 0){
                vetorTemp[contadorPares] = nroAuxiliar;
            }
            else{
                // se não for par, decrementa o contadorPares (para quando o par não for gerado)
                contadorPares--;
            }
            // incrementa o auxiliar
            nroAuxiliar++;
        }
        // retorna o vetor gerado   
        return vetorTemp;
    }
}
