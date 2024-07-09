import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número de sua Agência com o digito verificador: ");
        String agencia = scanner.next();

        System.out.println("Digite sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu Saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia
                        + ", Conta "
                        + numero + " e seu Saldo de " + saldo + " já está disponível para saque.");

    }
}
