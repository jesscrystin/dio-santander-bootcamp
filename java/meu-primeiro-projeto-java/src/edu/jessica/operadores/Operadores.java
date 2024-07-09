package edu.jessica.operadores;

public class Operadores {

    public static void main(String[] args) {

        // atribuição

        String nome = "Jéssica Melo";
        int idade = 26;
        double peso = 100.0;
        char sexo = 'M';
        boolean doadorOrgao = true;

        // aritiméticos

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // repetição

        int numero = 5;

        /* numero = numero + 1; é a mesma coisa que: */

        numero++;

        boolean variavel = false;

        variavel = !variavel;

        // ternário

        // <expressão condicional> ? <caso condição seja true> : <caso a condição seja
        // false>

        int a, b;
        String valor = "";

        a = 5;
        b = 5;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * 
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        valor = a == b ? "verdadeiro" : "falso";

    }

}
