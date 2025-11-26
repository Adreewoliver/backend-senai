
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {
      System.out.println("digite um numero para verificação se é Par ou ímpar");
      try (Scanner ler = new Scanner(System.in)) {
        int numero = ler.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par.");
        } else {
            System.out.println("O número " + numero + " é Ímpar.");
        }
      }
    }
}
