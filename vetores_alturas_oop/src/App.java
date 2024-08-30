import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "° pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vet[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        for (int j = 0; j < vet.length; j++) {
            soma += vet[j].getAltura();
        }
        double media = soma / vet.length;
        System.out.println("Altura média: " + media);

        double qtd = 0;
        for (int k = 0; k < vet.length; k++) {
            if (vet[k].getIdade() < 16) {
                qtd++;
            }
        }

        double porcentagem = (qtd / vet.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem);
        for (int l = 0; l < vet.length; l++) {
            if (vet[l].getIdade() < 16) {
                System.out.println(vet[l].getNome());
            }
        }
        sc.close();
    }
}
