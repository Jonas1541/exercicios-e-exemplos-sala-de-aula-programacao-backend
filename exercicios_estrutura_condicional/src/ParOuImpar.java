import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }

        sc.close();
    }
}
