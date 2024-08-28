import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dígitos (max = 10): ");
        int n = sc.nextInt();

        if(n > 10) {
            System.out.println("Quantidade inválida!");
        }

        int[] vet = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS:");

        for(int j = 0; j < vet.length; j++) {
            if(vet[j] < 0) {
                System.out.println(vet[j]);
            }
        }

        sc.close();
    }
}