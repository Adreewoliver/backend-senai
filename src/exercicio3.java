
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
      System.out.println("digite a largura do triangulo:");
      try (Scanner ler = new Scanner(System.in)) {
        int num1 = ler.nextInt();
        System.out.println("digite a altura do triangulo:");
        int num2 = ler.nextInt();
        int multiplicacao = num1 * num2;
        System.out.println("a medida do triangulo é: " + multiplicacao);
        
        
      }
        
    }
}
