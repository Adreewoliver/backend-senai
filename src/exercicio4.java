
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) throws Exception {
      System.out.println("digite sua idade");
      try (Scanner ler = new Scanner(System.in)) {
        int idade = ler.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Proibida a entrada de menores de 18 anos.");
        }
      }
    }
}
