/*
1 - Inicie um novo projeto ("Aula13_02") e, com uma função recursiva, repita o 
exercício do primeiro exemplo de recursão, porém, faça a impressão decrescente de 10 a 1.
 */
package aula13_02;

public class RecursividadeDecrescente {

    public static void main(String[] args) {
        
        System.out.println("*** Recursividade Decrescente ***");
        
        int x = 1;
        System.out.println("[main - recursão] Valor de 'x' antes da função: " + x);
        System.out.print("\n");
        imprimirRecursividadeDecrescente(x);
        System.out.print("\n");
        System.out.println("[main - recursão] Valor de 'x' após a função: " + x);
        System.out.print("\n\n");
        
        x = 10;
        System.out.println("[main - recursão de cauda] Valor de 'x' antes da função: " + x);
        System.out.print("\n");
        imprimirRecursividadeDecrescenteOutra(x);
        System.out.print("\n");
        System.out.println("[main - recursão de cauda] Valor de 'x' após a função: " + x);
    }
    
    private static void imprimirRecursividadeDecrescente(int i) {
        if (i < 10) {
            imprimirRecursividadeDecrescente(i + 1);
        }
        System.out.println("[recursão decrescente] Saindo da função recursiva: " + i);
    }    

    private static void imprimirRecursividadeDecrescenteOutra(int i) {
        System.out.println("[recursão decrescente] Entrando na função recursiva: " + i);
        if (i > 1) {
            imprimirRecursividadeDecrescenteOutra(i - 1);
        }
    }    
}
