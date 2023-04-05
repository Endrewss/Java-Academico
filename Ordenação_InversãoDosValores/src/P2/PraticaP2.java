
package P2;

import java.util.Scanner;

public class PraticaP2 {
    
    
    public static void main (String[] args){
        
        System.out.println("*** Impressão e inversão de dados ***");
        
        Scanner entrada = new Scanner(System.in);
        
        
        int vetor[] = new int[10];
        int i;
        
        for( i = 0; i < 10; i++) {
            System.out.print("Digite um valor para a " + (i+1) + "º posição:");
            vetor[i] = entrada.nextInt();
        }
        
        System.out.println("\n");
        
        for(i = 0; i < 10; i++){
            System.out.println("Imprimindo todos os valores informados: " + i + "º = " + vetor[i]);
        }
        System.out.println("\n");
        
        System.out.println("***Impressão dos Valores invertidos***");
        
      
        i = 10;
      while (i > 0){
            i--;
            System.out.println("Imprimindo todos os valores informados: " + i + "º = " + vetor[i]);
        }
        
    }
}
        
