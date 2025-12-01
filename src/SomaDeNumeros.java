import java.util.Scanner;

public class SomaDeNumeros {

    public static void main(String[] args) {
        
    
        double soma = 0.0; 
        double numeroAtual; 
        
    try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("======================================");
        System.out.println("       SOMADOR DE NÚMEROS INFINITO    ");
        System.out.println("======================================");
        System.out.println("Digite os números que deseja somar.");
        System.out.println("Digite -1 para encerrar e ver o total.");
        System.out.println("======================================");


        do {
            System.out.print("Digite um número (-1 para sair): ");
            
            if (scanner.hasNextDouble()) {
                numeroAtual = scanner.nextDouble();
                
               
                if (numeroAtual != -1) {
                 
                    soma += numeroAtual; 
                    System.out.println("  [Soma parcial: " + soma + "]");
                }
                
            } else {
               
                System.out.println(" Entrada inválida. Por favor, digite um número.");
                scanner.next(); 
                numeroAtual = 0; 
            }
            
      
        } while (numeroAtual != -1);

     
        System.out.println("\n--------------------------------------");
        System.out.println("FIM DO PROGRAMA.");
        System.out.println("A soma total dos números digitados é: " + soma);
        System.out.println("--------------------------------------");
    }
    }
}