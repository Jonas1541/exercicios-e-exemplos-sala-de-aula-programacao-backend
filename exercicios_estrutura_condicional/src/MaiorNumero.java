import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números quer comparar: ");
        int qtd = sc.nextInt();

        int maior = 0;
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int n = sc.nextInt();
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("O maior número foi: " + maior);

        sc.close();
    }
}
