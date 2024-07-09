import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número de sua Agência com o digito verificador: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia
                        + ", Conta "
                        + numero + " e seu Saldo de " + saldo + " já está disponível para saque.");

    }
}
