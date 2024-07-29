import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.println("Área: " + area);
        sc.close();
    }
}
