public class FibonacciIntDoWhile {

    public static void main(String[] args) {
        
        int n = 10; 
        int anterior = 0; 
        int atual = 1; 
        int proximo; 
        
        
        int contador = 1; 

        System.out.println("Sequência de Fibonacci com int (Primeiros " + n + " termos usando do-while):");

        do {
            
            System.out.print(atual + " ");

            
            proximo = anterior + atual; 

          
            anterior = atual; 
            atual = proximo; 
            
       
            contador++;

        } while (contador <= n); 
        
        
    }
}