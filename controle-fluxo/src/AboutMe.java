import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        // criando i objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        String idade = scanner.next();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + " ");
        System.out.println("Tenho " + idade + "anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();

    }

}
