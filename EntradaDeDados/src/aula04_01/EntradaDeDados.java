
package aula04_01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDeDados {

    public static void main(String[] args) {
        
        System.out.println("*** Entrada de Dados ***");
        // declara tipo Scanner para poder ler dados digitados via teclado e
        // inicializa variável chamada "entrada" (do tipo Scanner) para 
        // que ela possa receber os dados 
        Scanner entrada = new Scanner(System.in);
        // recebe o nome do usuário
        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();
        // recebe a idade do usuário
        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();
        
        // exibe os valores recebidos a partir do usuário
        System.out.println("Nome: " + nome + "; idade: " + idade + " anos.");

        
        
        // também é possível utilizar a biblioteca Swing para fazer uso de interfaces gráficas
        JOptionPane.showMessageDialog(null, "Olá, mundo!");
        
        // solicita nome do usuário e o recebe numa variável String
        String nomeUsuario = JOptionPane.showInputDialog("Digite seu nome: ");
        // exibe, via JOptionPane, o nome recebido (também via JOptionPane)
        JOptionPane.showMessageDialog(null, "Olá, " + nomeUsuario + ", seja bem-vindo(a).");
        
        
    }
    
}
