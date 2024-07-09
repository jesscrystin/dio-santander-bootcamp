package edu.jessica.anatomiadasclasses;

public class MinhaClasse {

    public static void main(String[] args) {

        // Tipos primitivos

        String primeiroNome = "Luiz";
        String segundoNome = "Guilherme";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = 10;

        final double VALOR_DE_PI = 3.14;

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
