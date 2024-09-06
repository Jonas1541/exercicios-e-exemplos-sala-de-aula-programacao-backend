import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int soma = 0;
        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            soma += n;
        } while(n != 0);

        System.out.println("A soma dos números foi: " + soma);

        sc.close();
    }
}
