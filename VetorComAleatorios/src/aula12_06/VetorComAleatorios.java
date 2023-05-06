/*
5 - Escreva um programa ("Aula12_06") que receba 10 valores aleatórios do usuário e 
armazene-os num vetor. Após receber o 10º. valor, monte uma lógica que retorne o 
menor e o maior valores armazenados neste vetor.
 */
package aula12_06;

import java.util.Scanner;

public class VetorComAleatorios {

    public static void main(String[] args) {
        int vetNrosAleatorios[] = new int[10];
        int nroMaior, nroMenor;
        
        System.out.println("*** 10 Números Aleatórios no Vetor ***");
        Scanner leitor = new Scanner(System.in);
        
        // recebe 10 valores quaisquer do usuário
        for (int i = 0; i < vetNrosAleatorios.length; i++){
            System.out.print(
                String.format(
                    "Informe um número qualquer para a posição '%d': ", (i+1)));
            vetNrosAleatorios[i] = leitor.nextInt();
        }
        
        // inicializa variáveis com um valor qualquer (como ponto de partida)
        nroMaior = nroMenor = vetNrosAleatorios[0];
        // faz laço para percorrer o vetor, verificando quem é maior e quem é menor
        for (int i = 0; i < vetNrosAleatorios.length; i++){
            if (vetNrosAleatorios[i] > nroMaior){
                nroMaior = vetNrosAleatorios[i];
            }
            else if (vetNrosAleatorios[i] < nroMenor){
                nroMenor = vetNrosAleatorios[i];
            }
        }
        // apresenta o resultado
        System.out.println(String.format(
            "O menor e o maior número informados são, respectivamente: %d e %d", 
                nroMenor, nroMaior));
    }
}
