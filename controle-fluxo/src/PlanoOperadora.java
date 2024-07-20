import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {

        criarPlanoTelefonico();
        planoTelefonicoSegundoProfessor();
    }

    public static void criarPlanoTelefonico() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escolha entre o plano: BASIC, MIDIA e TURBO ou digite 0 para sair.");
        String escolhaCliente = scanner.nextLine();

        switch (escolhaCliente) {
            case "BASIC": {
                System.out.println("Foi contratado o plano: BASIC:100 minutos de ligação.");
                break;
            }
            case "MIDIA": {
                System.out.println("Foi contratado o plano: MIDIA:100 minutos de ligação + Whats e Instagram grátis.");
                break;
            }
            case "TURBO": {
                System.out.println(
                        "Foi contratado o plano: TURBO:100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube.");
                break;
            }

            case "0": {
                break;
            }

            default: {
                System.out.println("Plano não encontrado! Tente novamente.");

                criarPlanoTelefonico();
            }
        }
    }

    public static void planoTelefonicoSegundoProfessor() {

        char plano = 'T'; // B / M / T

        switch (plano) {
            case 'T': {
                System.out.println("5Gb Youtube");
            }
            case 'M': {
                System.out.println("Whats e Instagram grátis");
            }
            case 'B': {
                System.out.println("100 minutos de ligação");
            }
        }
    }

}
