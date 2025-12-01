import java.util.Scanner;

public class senha {

    public static void main(String[] args) {
        
        // 1. Define a senha correta
        final String SENHA_CORRETA = "1234"; 
        
        // Variável para armazenar a senha digitada pelo usuário
        String senhaDigitada; 
        
        // Inicializa o Scanner para leitura de dados usando try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {

            // O loop 'do-while' garante que a senha será pedida pelo menos uma vez
            do {
                System.out.println("-------------------------");
                System.out.print("Por favor, digite a senha: ");
                
                // Lê a linha digitada pelo usuário
                senhaDigitada = scanner.nextLine(); 

                // Verifica se a senha está correta
                if (!senhaDigitada.equals(SENHA_CORRETA)) {
                    System.out.println(" Senha incorreta! Tente novamente.");
                }
                
            // A condição do 'while' verifica se a senha digitada é diferente da senha correta.
            // O loop continua ENQUANTO a condição for verdadeira (senhas diferentes).
            } while (!senhaDigitada.equals(SENHA_CORRETA));

            // Este bloco é executado somente após a saída do loop (ou seja, quando a senha está correta)
            System.out.println("-------------------------");
            System.out.println("Login efetuado com sucesso! Bem-vindo(a).");
        }
    }
}