
package aula15_01;

public class TratamentoExcecao {

    public static void main(String[] args) {
        System.out.println("*** Programa para tratamento de exceções ***");
        
        try {
            System.out.println("[try] Tenta executar alguns comandos...");
            // tenta executar algo dentro do bloco de try.
            int x = 10 / 1;

            int vet[] = new int[3];
            vet[2] = 10;
            
            int j = Integer.parseInt("0");
            
            // se der erro, o(s) bloco(s) de catch captura(m) o erro para tratamento
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[catch] Estouro de array.");
            System.out.println(e.toString());
        }
        catch (ArithmeticException e) {
            System.out.println("[catch] Não é possível realizar divisão por zero.");
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println("[catch] Erro genérico ao executar o programa.");
            System.out.println(e.toString());
        }
        finally{
            System.out.println("[finally] Fim do bloco 'try' do programa.");
        }
        
        System.out.println("Fim do programa.");
    }
    
}
