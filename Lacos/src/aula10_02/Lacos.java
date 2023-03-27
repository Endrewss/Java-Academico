/*
1 - Em num novo projeto (Aula10_02), declare 3 variáveis inteiras (i, j, k) e
inicialize-as com 0. Utilizando os 3 laços de repetição, faça um programa que
imprima as iterações de 0 a 9 para cada uma das variáveis, incrementando cada
uma delas com uma estrutura de repetição diferente.
 */
package aula10_02;

public class Lacos {

    public static void main(String[] args) {
        
        System.out.println("*** Laços de Repetição ***");
        int i = 0, j = 0, k = 0;
        // laço de repetição com "for"
        for (i = 0; i < 10; i++){
            System.out.println("[for] contador: " + i);
        }
        System.out.print("\n");
        
        // laço de repetição com "while"
        while(j < 10){
            System.out.println("[while] contador: " + j++);
        }
        System.out.print("\n");
        
        // laço de repetição com "do..while"
        do{
            System.out.println("[do..while] contador: " + k++);
        }while(k < 10);
    }
}
