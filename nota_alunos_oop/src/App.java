import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();
        
        System.out.print("Digite o nome do aluno: ");
        estudante.nome = sc.nextLine();
        System.out.print("Digite a 1° nota: ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Digite a 2° nota: ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Digite a 3° nota: ");
        estudante.nota3 = sc.nextDouble();

        System.out.println("Nota final = " + estudante.media());
        System.out.println(estudante.resultado());

        sc.close();
    }
}
