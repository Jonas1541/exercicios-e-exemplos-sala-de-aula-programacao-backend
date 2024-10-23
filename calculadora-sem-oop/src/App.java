import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double PI = 3.14;

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = 2 * raio * PI;

        double area = PI * raio * raio;

        System.out.println("Circunferência: " + circunferencia);

        System.out.println("Área: " + area);

        System.out.println("valor de PI: " + PI);

        sc.close();
    }
}
