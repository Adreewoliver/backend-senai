public class Fibonacci10Termos {

    public static void main(String[] args) {
        // Define o número de termos que queremos gerar
        int n = 10; 
        
        // 1. Variáveis de inicialização (Começando com 0 e 1, conforme solicitado)
        // 'anterior' armazena o termo F(n-2)
        long anterior = 0; 
        
        // 'atual' armazena o termo F(n-1)
        long atual = 1; 
        
        // 'proximo' será a soma de anterior + atual
        long proximo; 

        System.out.println("Sequência de Fibonacci (Primeiros " + n + " termos, começando em 0):");
        
        // Imprime o primeiro termo (0) antes do loop
        System.out.print(anterior + " ");

        // O loop vai de 1 até n-1 (9 vezes), pois o primeiro termo (0) já foi impresso
        for (int i = 1; i <= n; ++i) {
            
            // 2. Imprime o termo ATUAL da sequência
            System.out.print(atual + " ");

            // 3. Calcula o PRÓXIMO termo
            proximo = anterior + atual; 

            // 4. Atualiza as variáveis para a próxima iteração:
            // O anterior vira o atual
            anterior = atual; 
            
            // O atual vira o próximo calculado
            atual = proximo; 
        }
        
        // Saída esperada: 0 1 1 2 3 5 8 13 21 34 
    }
}