import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o nome do aluno? ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota do 1° Trimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota do 2° Trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota do 3° Trimestre: ");
        double nota3 = sc.nextDouble();

        

        sc.close();
    }
}
