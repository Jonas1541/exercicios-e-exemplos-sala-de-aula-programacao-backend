import java.util.Scanner;

public class Soma_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vc vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.print("VALORES = ");

        int soma = 0;
        for(int j = 0; j < vet.length; j++) {
            System.out.print(vet[j] + " ");
            soma += vet[j];
        }
        double media = (double) soma / vet.length;

        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
