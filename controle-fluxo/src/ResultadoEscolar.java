public class ResultadoEscolar {

    public static void main(String[] args) { // perguntar o Gui, o que significa esses parametros? String[] args
        condicionalComposta();
        condicionalEncadeada();
        condicaoTernaria();
    }

    public static void condicionalComposta() {
        int nota = 6;

        // condicional composta
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void condicionalEncadeada() {
        int nota = 6;

        // condicional encadeada
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void condicaoTernaria() {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
