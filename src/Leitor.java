import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            String nome = ler.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = ler.nextInt();
            System.out.println("Sua idade é " + idade + " anos, " + nome + "!");
        }
    }
}
