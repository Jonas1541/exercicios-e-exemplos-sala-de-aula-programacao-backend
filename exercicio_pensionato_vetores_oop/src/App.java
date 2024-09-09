import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Estudante[] quartos = new Estudante[10];

        for(int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int posicao = sc.nextInt();
            sc.nextLine();
            quartos[posicao] = new Estudante(nome, email);
        }

        System.out.println("Quartos ocupados:");

        for(int j = 0; j < quartos.length; j++) {
            if(quartos[j] != null) {
                System.out.println(j + ": " + quartos[j].toString());
            }
        }

        sc.close();
    }
}
