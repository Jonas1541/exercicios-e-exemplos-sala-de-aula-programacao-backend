import java.util.Scanner;

public class While {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (se for 0, fim): ");
        int n = sc.nextInt();

        int soma = n;
        while(n != 0) {
            System.out.print("Digite mais um número: ");
            n = sc.nextInt();
            soma += n;
        }

        System.out.println("A soma dos números foi: " + soma);

        sc.close();
    }
}
