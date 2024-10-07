import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Lados do X
        System.out.println("Digite os lados de X: ");
        System.out.print("Lado a: ");
        double xa = sc.nextDouble();
        System.out.print("Lado b: ");
        double xb = sc.nextDouble();
        System.out.print("Lado c: ");
        double xc = sc.nextDouble();

        //Lados do Y
        System.out.println("Digite os lados de Y: ");
        System.out.print("Lado a: ");
        double ya = sc.nextDouble();
        System.out.print("Lado b: ");
        double yb = sc.nextDouble();
        System.out.print("Lado c: ");
        double yc = sc.nextDouble();

        double xp = (xa + xb + xc) / 2;
        double yp = (ya + yb + yc) / 2;

        double xarea = Math.sqrt(xp * (xp - xa) * (xp - xb) * (xp - xc));
        double yarea = Math.sqrt(yp * (yp - ya) * (yp - yb) * (yp - yc));

        System.out.println("Área do Triângulo X: " + xarea);
        System.out.println("Área do Triângulo Y: " + yarea);

        if(xarea > yarea) {
            System.out.println("Área maior: Triângulo X.");
        } else {
            System.out.println("Área maior: Triângulo Y.");
        }

        sc.close();
    }
}
