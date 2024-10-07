import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        int soma = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int m = sc.nextInt();
            soma += m;
        }

        System.out.println("A soma dos números foi: " + soma);

        sc.close();
    }
}
