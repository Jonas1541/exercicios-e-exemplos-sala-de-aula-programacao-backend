import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        System.out.print("Nome: ");
        f.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        f.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        f.imposto = sc.nextDouble();

        System.out.println(f.toString());

        System.out.print("Qual a porcentagem de aumento de salário: ");
        double porcentagem = sc.nextDouble();
        f.aumentarSalario(porcentagem);

        System.out.println("Dados atualizados: " + f.toString());


        sc.close();
    }
}
