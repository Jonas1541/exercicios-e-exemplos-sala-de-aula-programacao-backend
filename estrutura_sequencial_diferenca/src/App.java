import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor C: ");
        int c = sc.nextInt();
        System.out.print("Digite o valor D: ");
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("A diferença é: " + diferenca);

        sc.close();
    }
}
