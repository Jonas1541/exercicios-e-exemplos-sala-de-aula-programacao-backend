import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios vc vai registrar? ");
        int n = sc.nextInt();

        //Criação de lista de funcionários vazia
        List<Funcionario> funcionarios = new ArrayList<>();

        //Coletando as informações da quantia de funcionários requerida
        for(int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            //Instanciação do funcionário com as informações passadas
            Funcionario funcionario = new Funcionario(id, nome, salary);
            //Adição desse funcionário na lista
            funcionarios.add(funcionario);
        }

        System.out.print("Digite o id do funcionário que vai ter o salário aumentado: ");
        int id = sc.nextInt();
        System.out.print("Digite a porcentagem: ");
        double porcentagem = sc.nextDouble();

        //Percorre lista em busca do funcionário com o id passado e aplica o aumento
        for(Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == id) {
                //A função de aumento existe na própria classe, pois é relacionada ao funcionário
                funcionario.aumentarSalario(porcentagem);
            }
        }

        System.out.print("Digite o id do funcionário que vai ter o salário reduzido: ");
        id = sc.nextInt();
        System.out.print("Digite a porcentagem: ");
        porcentagem = sc.nextDouble();

        //Percorre lista em busca do funcionário com o id passado e aplica a redução
        for(Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == id) {
                //A função de aumento existe na própria classe, pois é relacionada ao funcionário
                funcionario.diminuirSalario(porcentagem);
            }
        }

        //Percorrer lista pra mostrar todos os funcionários
        for(Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }

        sc.close();
    }
}
