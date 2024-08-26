import java.util.Scanner;

public class NumerosNegativos2 {
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

        // Primeiro loop para contar quantos números são negativos
        int countNegativos = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] < 0) {
                countNegativos++;
            }
        }

        // Criação do vetor de negativos com o tamanho exato
        int[] negativos = new int[countNegativos];
        int index = 0;

        // Segundo loop para armazenar os números negativos no vetor apropriado
        for (int i = 0; i < N; i++) {
            if (numeros[i] < 0) {
                negativos[index] = numeros[i];
                index++;
            }
        }

        // Exibir os números negativos
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < countNegativos; i++) {
            System.out.println(negativos[i]);
        }

        scanner.close();
    }
}
