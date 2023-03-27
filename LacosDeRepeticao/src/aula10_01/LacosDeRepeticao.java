
package aula10_01;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        // Laços de Repetição
        // *** FOR ***
        System.out.println("Laço de repetição: 'for' crescente.");
        for (int i = 1; i <= 10; i++){
            System.out.println("[for] contador: " + i);
        }
        System.out.print("\n");

        System.out.println("Laço de repetição: 'for' decrescente.");
        for (int i = 10; i >= 1; i--){
            System.out.println("[for] contador: " + i);
        }
        System.out.print("\n");
        
        int i = 1;
        // laço infinito
        System.out.println("Laço de repetição: 'for' (sem o 'if' e o 'break' abaixo, seria um loop (laço) infinito).");
        for ( ; ; ){
            System.out.println("[for] contador: " + i++);
            // se não fosse pelo 'if' abaixo, seria um loop (laço) infinito
            if (i > 10)
                break;
        }
        System.out.println("\n\n");
        
        // *** WHILE ***
        System.out.println("Laço de repetição: 'while' crescente.");
        i = 1;
        while (i <= 10){
            System.out.println("[while] contador: " + i++);
        }
        System.out.print("\n");
        
        System.out.println("Laço de repetição: 'while' decrescente.");
        i = 10;
        while (i >= 1){
            System.out.println("[while] contador: " + i--);
        }
        
        i = 1;
        System.out.print("\n");
        
        // laço infinito
        System.out.println("Laço de repetição: 'while' (sem o 'if' e o 'break' abaixo, seria um loop (laço) infinito).");
        while (true){
            System.out.println("[while] contador: " + i++);
            // se não fosse pelo 'if' abaixo, seria um loop (laço) infinito
            if (i > 10)
                break;
        }
        System.out.println("\n\n");
        
        // *** DO..WHILE ***
        System.out.println("Laço de repetição: 'do..while' crescente.");
        i = 1;
        do{
            System.out.println("[do..while] contador: " + i++);
        }while (i <= 10);
        System.out.print("\n");
        
        System.out.println("Laço de repetição: 'do..while' decrescente.");
        i = 10;
        do{
            System.out.println("[do..while] contador: " + i--);
        }while (i >= 1);

        i = 1;
        System.out.print("\n");
        
        // laço infinito
        System.out.println("Laço de repetição: 'do..while' (sem o 'if' e o 'break' abaixo, seria um loop (laço) infinito).");
        do{
            System.out.println("[do..while] contador: " + i++);
            // se não fosse pelo 'if' abaixo, seria um loop (laço) infinito
            if (i > 10)
                break;
        }while (true);
        System.out.print("\n\n");
        
        // exemplo do uso do comando "continue"
        for (int x = -10; x <= 10; x++){
            if (x == 0 || x == -2 || x == 4){
                System.out.println("[contador] ==>> saltou o número: " + x + "\n");
                continue;
            }
            System.out.println("[contador] uso do 'continue': " + x);
        }
    }
}
