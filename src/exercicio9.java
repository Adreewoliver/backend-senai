
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio9 {
    

public class CalculadoraIMC {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.00");
            
            System.out.println("--- Calculadora de Índice de Massa Corporal (IMC) ---");
            
            double peso = 0;
            double altura = 0;
            
            while (true) {
                System.out.print("Digite seu peso em kg (ex: 70.5): ");
                if (scanner.hasNextDouble()) {
                    peso = scanner.nextDouble();
                    if (peso > 0) {
                        break;
                    } else { 
                        System.out.println("O peso deve ser um valor positivo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número para o peso.");
                    scanner.next();
            }
            
            
            while (true) {
                System.out.print("Digite sua altura em metros (ex: 1.75): ");
                if (scanner.hasNextDouble()) {
                    altura = scanner.nextDouble();
                    if (altura > 0) {
                        break;
                    } else { 
                        System.out.println("A altura deve ser um valor positivo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número para a altura.");
                    scanner.next();
                }
            }
            
            
            double imc = peso / (altura * altura);
            
            
            String classificacao;
            
            
            if (imc < 17) {
                classificacao = "Muito abaixo do peso";
            } else if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc < 25) {
                classificacao = "Parabéns! Peso ideal";
            } else if (imc < 30) {
                classificacao = "Acima do peso";
            } else if (imc < 35) {
                classificacao = "Obesidade I";
            } else if (imc < 40) {
                classificacao = "Obesidade II (severa)";
            } else {
                classificacao = "Obesidade III (mórbida)"; 
            }
            System.out.println("\n--- Resultado ---");
            System.out.println("Seu IMC é: **" + df.format(imc) + "**");
            System.out.println("Classificação: **" + classificacao + "**");
            System.out.println("-----------------");
        }
    }
}
    
      
      
    }
}
