import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n = sc.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2 = sc.nextInt();

        if(n > n2) {
            if(n % n2 == 0) {
                System.out.println("São múltiplos.");
            } else {
                System.out.println("Não são múltiplos.");
            }
        } else {
            if(n2 % n == 0) {
                System.out.println("São múltiplos.");
            } else {
                System.out.println("Não são múltiplos.");
            }
        }
        sc.close();
    }
}
