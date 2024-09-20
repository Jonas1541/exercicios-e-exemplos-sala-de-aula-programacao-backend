import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Digite os lados do triângulo X:");
        System.out.print("Lado a: ");
        x.a = sc.nextDouble();
        System.out.print("Lado b: ");
        x.b = sc.nextDouble();
        System.out.print("Lado c: ");
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y:");
        System.out.print("Lado a: ");
        y.a = sc.nextDouble();
        System.out.print("Lado b: ");
        y.b = sc.nextDouble();
        System.out.print("Lado c: ");
        y.c = sc.nextDouble();

        System.out.println("Área do X: " + x.area());
        System.out.println("Área do Y: " + y.area());

        if(x.area() > y.area()) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}
