
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) throws Exception {
      System.out.println("digite a altura da primeira pessoa");
      try (Scanner ler = new Scanner(System.in)) {
        double altura1 = ler.nextDouble();
        System.out.println("digite a altura da segunda pessoa");
        double altura2 = ler.nextDouble();
        if (altura1 > altura2) {
            System.out.println("A primeira pessoa é mais alta.");
        } else if (altura2 > altura1) {
            System.out.println("A segunda pessoa é mais alta.");
        } else {
            System.out.println("As duas pessoas têm a mesma altura.");
        }
      }
      
      
    }
}
