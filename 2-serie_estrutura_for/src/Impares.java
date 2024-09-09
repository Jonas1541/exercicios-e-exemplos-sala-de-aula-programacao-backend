import java.util.Scanner;

public class Impares {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
