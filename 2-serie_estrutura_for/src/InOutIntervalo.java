import java.util.Scanner;

public class InOutIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int aux = sc.nextInt();
            if (aux >= 10 && aux <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}