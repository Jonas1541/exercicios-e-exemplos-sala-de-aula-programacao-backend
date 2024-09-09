import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
        } while (n != 0);

        sc.close();
    }
}
