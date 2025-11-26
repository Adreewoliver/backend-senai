
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) throws Exception {
      System.out.println("digite uma letra para verificação se é vogal ou consoante");
      try (Scanner ler = new Scanner(System.in)) {
        char letra = ler.next().charAt(0);
        letra = Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
      }
      
      
    }
}
