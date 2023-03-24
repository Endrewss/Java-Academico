
package aula06_01;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        // chama (executa) as sub-rotinas do tipo procedimento...
        // ...sem parâmetro...
        mostrarHelloWorld();
        // ...com parâmetro...
        mostrarMensagem("Olá, mundo!");
        mostrarMensagem("Zawarudo!!");
        // chama (executa) as sub-rotinas do tipo função...
        // ...sem parâmetro...
        int anoDescobrimento = retornarAnoDescobrimento();
        mostrarMensagem("O Brasil foi 'descoberto' em: " + anoDescobrimento);
        // ...com parâmetro...
        int somatoria = somar(8, 12);
        mostrarMensagem("O resultado da soma é: " + somatoria);
    }
    
    public static int retornarAnoDescobrimento(){
        return 1500;
    }

    public static int somar(int nro1, int nro2){
        int somatoria;
        somatoria = nro1 + nro2;
        return somatoria;
    }
    
    public static void mostrarHelloWorld(){
        JOptionPane.showMessageDialog(null, "Java>>>>Phyton");
    }

    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    
}
