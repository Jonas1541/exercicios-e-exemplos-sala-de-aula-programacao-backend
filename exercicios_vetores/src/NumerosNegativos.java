import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = scanner.nextInt();

        // Validação para garantir que N seja entre 1 e 10
        if (N > 10 || N <= 0) {
            System.out.println("O valor de N deve ser entre 1 e 10.");
            return;
        }

        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < N; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}