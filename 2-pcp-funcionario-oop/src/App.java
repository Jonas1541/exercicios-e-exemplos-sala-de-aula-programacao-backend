import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionario f = new Funcionario(nome, salarioBruto, imposto);

        System.out.println(f.toString());

        System.out.print("Porcentagem de aumento de salário: ");
        double porcentagem = sc.nextDouble();

        f.aumentarSalario(porcentagem);

        System.out.println("Dados atualizados:");
        System.out.println(f.toString());

        sc.close();
    }
}
