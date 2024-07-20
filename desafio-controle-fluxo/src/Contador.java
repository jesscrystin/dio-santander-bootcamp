import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {

			validar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}

		contar(parametroUm, parametroDois);
	}

	private static void contar(int parametroUm, int parametroDois) {

		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {

			System.out.println("Imprimindo o número " + i);

		}

	}

	private static void validar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
	}
}
