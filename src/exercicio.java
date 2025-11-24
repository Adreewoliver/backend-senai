
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) throws Exception {
      System.out.println("digite o seu nome");
      try (Scanner ler = new Scanner(System.in)) {
        String nome = ler.nextLine();
        System.out.println("Olá, " + nome + "!");
        System.out.println("Digite a sua nota1: ");
        int nota1 = ler.nextInt();  
        System.out.println("Digite a sua nota2: ");
        int nota2 = ler.nextInt();
        int media = (nota1 + nota2) / 2;
        System.out.println(nome +"A média é: " + media);  
        
      }
        
    }
}
