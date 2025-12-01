import java.util.Scanner;

public class MenuDoWhile {

    public static void main(String[] args) {
        
        int opcao; 
        
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("==============================");
            System.out.println("         MENU DE OPÇÕES       ");
            System.out.println("==============================");
            System.out.println("1 - Realizar Operação A");
            System.out.println("2 - Realizar Operação B");
            System.out.println("0 - Sair do Programa");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");
            
         
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); 
                opcao = -1; 
            }
            
           
            switch (opcao) {
                case 1:
                    System.out.println("\n-> Você escolheu a Opção 1. Operação A em execução...");
                    break;
                case 2:
                    System.out.println("\n-> Você escolheu a Opção 2. Operação B em execução...");
                    break;
                case 0:
                    System.out.println("\n👋 Opção 0 escolhida. Encerrando o programa...");
                    break;
                default:
                    if (opcao != -1) { // Evita a mensagem de erro se já tratamos uma entrada inválida
                        System.out.println("\n Opção inválida. Por favor, escolha 1, 2 ou 0.");
                    }
                    break;
            }
            
            System.out.println();
            
        } while (opcao != 0);

        scanner.close();
    }
}