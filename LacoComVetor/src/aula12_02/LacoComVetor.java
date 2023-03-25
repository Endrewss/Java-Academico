/*
1 - Crie um programa ("Aula12_02") que, utilizando um laço do tipo "while", 
preencha um vetor de inteiros com 10 valores de 21 a 30; com um laço do tipo
"for", percorra esse vetor e imprima seus valores na tela de maneira decrescente.
 */
package aula12_02;

public class LacoComVetor {

    public static void main(String[] args) {
        
        System.out.println("*** Laço Com Vetor ***");
        // declara um vetor de 10 posições
        int vetor[] = new int[10];
        // declara variável a ser usada como índice do vetor (e também valor a ser armazenado)
        int contador = 0;
        // enquanto não atingir o tamanho do vetor, mantém o laço em execução
        while(contador < vetor.length){
            vetor[contador] = 30 + contador++;
        }
        
        // percorre o vetor, de forma decrescente (e utilizando um "for") para exibir os valores
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.println(String.format("posição: %d, valor: %d", i, vetor[i]));
        }
    }
}
