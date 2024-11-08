import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da sua empresa: ");
        String nomeEmpresa = sc.nextLine();
        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = sc.nextLine();

        Enterprise enterprise = new Enterprise(1, nomeEmpresa, cnpj);

        System.out.print("Quantos funcionários você quer cadastrar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Digite o id do " + (i + 1) + "° funcionário: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do " + (i + 1) + "° funcionário: ");
            String nome = sc.nextLine();
            System.out.print("Digite o salário do " + (i + 1) + "° funcionário: ");
            double salario = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite a idade do " + (i + 1) + "° funcionário: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o tempo de empresa do " + (i + 1) + "° funcionário (em meses): ");
            int enterpriseTime = sc.nextInt();
            sc.nextLine();

            Employee employee = new Employee(id, nome, salario, idade, enterpriseTime, enterprise);
            enterprise.addEmployee(employee);
        }
        System.out.println();
        System.out.println("Dados da empresa:");
        System.out.println(enterprise.toString());

        System.out.println("Lista de funcionários da empresa:");

        for(Employee employee : enterprise.getEmployees()) {
            System.out.println();
            System.out.println(employee.toString());
        }

        sc.close();
    }
}
