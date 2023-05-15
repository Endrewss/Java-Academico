
package aula12_01;

public class Vetores {

    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("*** VETORES ***");
        System.out.println("***************");
        // declara e inicializa vetor de 3 posições
        int vet[] = new int[3];
        // atribui valores aos elementos (posições) do vetor
        vet[0] = 1;
        vet[1] = 10;
        vet[2] = 100;
        // utilizando 'i' como indexador, percorre o vetor 
        // para exibir seus valores
        for (int i = 0; i < vet.length ; i++){
            System.out.println("Vetor \"vet\": posição = " + i + ", valor = " + vet[i]);
        }
        // em Java é possível redimensionar um vetor já declarado
        System.out.println("Valores do vetor \"vet\" após o redimensionamento: ");
        vet = new int[7];
        vet[3] = 10;
        vet[4] = 100;
        for (int i = 0; i < vet.length ; i++){
            System.out.println("Vetor \"vet\": posição = " + i + ", valor = " + vet[i]);
        }
        
        System.out.println("\n****************");
        System.out.println("*** MATRIZES ***");
        System.out.println("****************");
        int matriz[][] = 
            {{1, 2, 3, 4, 5},
             {6, 7, 8, 9, 10},
             {2, 4, 6, 8, 10}};
        
        // percorre primeiramente cada linha da matriz; dentro de cada 
        // linha, percorre, então, cada uma de suas colunas
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println("");
        }
        
        // para deixar mais claro o posicionamento de cada célula, 
        // segue o mesmo laço, agora exibindo as linhas e colunas
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.print(String.format("[%d,%d]=%d ", l, c, matriz[l][c]));
            }
            System.out.println("");
        }           
    }
}
