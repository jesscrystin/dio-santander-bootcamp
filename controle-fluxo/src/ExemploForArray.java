public class ExemploForArray {

    public static void main(String[] args) {

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int i = 0; i < alunos.length; i++) {

            // em arrays o indice incia-se em ZERO.
            System.out.println("O aluno no indice x=" + i + " é " + alunos[i]);
        }

        usandoForEach();
    }

    public static void usandoForEach() {

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // forma abreviada.
        for (String aluno : alunos) {

            System.out.println("O nome do aluno é: " + aluno);
        }

    }
}
