public class Estudante {
    String nome;
    double nota1, nota2, nota3;

    double media() {
        return (nota1 + nota2 + nota3) / 3;
    }

    String resultado() {
        if(media() >= 60) {
            return "Aprovado!";
        } else {
            return "Reprovado! Faltaram " + (60 - media()) + " pontos pra passar.";
        }
    }
}
