import java.util.Scanner;

public class ValidaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        // O bloco 'do' é executado pelo menos uma vez.
        do {
            System.out.print("Por favor, digite sua nota (entre 0 e 10): ");
            // Verifica se o próximo token é um número e o lê
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                
                // Exibe uma mensagem de erro se a nota for inválida
                if (nota < 0 || nota > 10) {
                    System.out.println(" Erro! Nota inválida. A nota deve ser entre 0 e 10.");
                }
            } else {
                // Lida com a entrada que não é um número
                System.out.println("Erro! Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Descarta a entrada inválida para evitar loop infinito
                nota = -1; // Define um valor que garantirá a repetição do loop
            }
            
        // A condição 'while' verifica se a nota é menor que 0 OU maior que 10.
        // O loop continua enquanto esta condição for verdadeira (Nota < 0 OU Nota > 10).
        } while (nota < 0 || nota > 10);

        System.out.println("\n Nota válida lida: " + nota);
        
        scanner.close();
    }
}
