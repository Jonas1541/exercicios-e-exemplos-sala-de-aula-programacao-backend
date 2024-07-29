import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int aux = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int m = sc.nextInt();
            aux += m;
        }
        System.out.println("A soma dos " + n + " números é: " + aux);
        
        sc.close();
    }
}
