import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int soma = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            int aux = sc.nextInt();
            soma += aux;
        }
        System.out.println("A soma dos digitados foi: " + soma);

        sc.close();
    }
}
