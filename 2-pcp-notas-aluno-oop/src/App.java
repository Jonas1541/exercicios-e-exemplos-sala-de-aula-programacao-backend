import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota do 1° trimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota do 2° trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota do 3° trimestre: ");
        double nota3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("Nota final: " + aluno.notaFinal());
        System.out.println(aluno.resultado());

        sc.close();
    }
}