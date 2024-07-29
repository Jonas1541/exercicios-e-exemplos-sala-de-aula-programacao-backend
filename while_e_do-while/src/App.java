import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //versão while
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int aux = 0;
        while (n != 0) {
            aux += n;
            System.out.print("Digite mais um número: ");
            n = sc.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + aux);

        //versão do-while
        int aux = 0;
        int n = 0;
        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            aux += n;
        } while (n != 0);
        System.out.println("A soma dos números digitados é: " + aux);
        sc.close();
    }
}