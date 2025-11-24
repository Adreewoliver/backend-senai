
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
      System.out.println("digite o primeiro algarismo :");
      try (Scanner ler = new Scanner(System.in)) {
        int num1 = ler.nextInt();
        System.out.println("digite o segundo algarismo :");
        int num2 = ler.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos algarismos é: " + soma);
        int subtracao = num1 - num2;
        System.out.println("A subtração dos algarismos é: " + subtracao);
        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação dos algarismos é: " + multiplicacao);
        int divisao = num1 / num2;
        System.out.println("A divisão dos algarismos é: " + divisao); 
        
      }
        
    }
}
