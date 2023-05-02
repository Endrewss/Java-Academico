/*
1 - Crie uma classe chamada "TipoPrimitivo" (programa "Aula03_02") e declare uma variável 
de cada tipo primitivo. Feito isso, atribua valores a cada variável e, por fim, imprima 
cada uma delas na tela.

Nota: boolean, char, byte, short, int, long, float, double.
 */
package aula03_02;

public class TipoPrimitivo {

    public static void main(String[] args) {
        // declaração de variáveis com os tipos primitivos
        boolean logico;
        char caractere;
        byte baite;
        short inteiroCurto;
        int inteiro;
        long inteiroLongo;
        float decimal;
        double decimalLongo;
        
        // atribuição de valores aleatórios
        logico = false;
        caractere = 'E';
        baite = 100;
        inteiroCurto = 1000;
        inteiro = 10000;
        inteiroLongo = 100000;
        decimal = 10000.12f;
        decimalLongo = 100000.123;
        
        System.out.println(" *** Exibição dos valores das variáveis ***");
        System.out.println("boolean: " + logico);
        System.out.println("char: " + caractere);
        System.out.println("byte: " + baite);
        System.out.println("short: " + inteiroCurto);
        System.out.println("int: " + inteiro);
        System.out.println("long: " + inteiroLongo);
        System.out.println("float: " + decimal);
        System.out.println("double: " + decimalLongo);

    }
}



