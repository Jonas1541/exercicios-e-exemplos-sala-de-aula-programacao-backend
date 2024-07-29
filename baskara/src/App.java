import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("O valor de x1 é: " + x1 + " e o valor de x2 é: " + x2);
        sc.close();
    }
}
