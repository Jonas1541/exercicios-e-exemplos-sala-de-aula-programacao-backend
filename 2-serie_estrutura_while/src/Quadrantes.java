import java.util.Scanner;

public class Quadrantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o X: ");
        int x = sc.nextInt();

        System.out.print("Digite o Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1° quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("2° quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("3° quadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("4° quadrante.");
            }

            System.out.print("Digite o X: ");
            x = sc.nextInt();

            System.out.print("Digite o Y: ");
            y = sc.nextInt();
        }

        System.out.println("Raiz.");

        sc.close();
    }
}