
package aula13_01;

public class Recursividade {

    public static void main(String[] args) {
        
        System.out.println("*** Recursividade ***");
        
        int x = 1;
        System.out.println("[main] Valor de 'x' antes da função: " + x);
        System.out.print("\n");
        imprimirNumerosRecursivamenteTail(x);
        System.out.print("\n");
        imprimirNumerosRecursivamenteHead(x);
        System.out.print("\n");
        System.out.println("[main] Valor de 'x' após a função: " + x);
    }

    private static void imprimirNumerosRecursivamenteTail(int i) {
        System.out.println("[recursividade] Entrando na função recursiva: " + i);
        if (i < 5) {
            imprimirNumerosRecursivamenteTail(i + 1);
        }
    }

    private static void imprimirNumerosRecursivamenteHead(int i) {
        if (i < 5) {
            imprimirNumerosRecursivamenteHead(i + 1);
        }
        System.out.println("[head recursion] Saindo da função recursiva: " + i);
    }
}