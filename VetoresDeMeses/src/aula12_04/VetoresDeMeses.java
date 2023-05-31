/*
3 - Crie um programa ("Aula12_04") que contenha 2 vetores de 12 posições. O primeiro, 
de Strings, armazenará os 12 meses do ano. O segundo vetor, de inteiros, armazenará 
a quantidade de dias de cada mês (considerando anos não bissextos). Solicite um 
número de 1 a 12 ao usuário e, após receber esse número, imprima o mês 
correspondente e a quantidade de dias que esse mês possui.
 */
package aula12_04;

import java.util.Scanner;

public class VetoresDeMeses {

    public static void main(String[] args) {
        
        System.out.println("*** Vetores de Meses ***");
        
        // declara e inicializa os vetores com os nomes e as quantidades de dias de cada mês
        String vetMeses[] = new String[]{"Janeiro", "Fevereiro", "Março", "Abril",
                            "Maio", "Junho", "Julho", "Agosto", "Setembro",
                            "Outubro", "Novembro", "Dezembro"};
        int vetDiasMeses[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // solicita ao usuário que informe um mês qualquer
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número de 1 a 12 correspondente a um mês do ano: ");
        int mes = sc.nextInt();
        
        // valida a informação inserida
        if (mes < 1 || mes > 12){
            System.out.println("Mês inválido.");
        }
        else{
            System.out.println(String.format("O mês de %s tem %d dias.", 
                    vetMeses[mes - 1], vetDiasMeses[mes - 1]));
        }
    }
}
