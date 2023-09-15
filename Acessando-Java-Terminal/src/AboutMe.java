import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();


        System.out.println("Olá,me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha Altura é " + altura + "cm");

        /*
         * Nesse modolo, eu estudei conceitos de como acessar o meu arquivo Java através
         * do Terminal.
         * E tambem estudei "Argumentos" e como ele funciona em uma aplicação.
         */
    

    }
}
