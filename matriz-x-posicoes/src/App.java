import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Coleto o tamanho da matriz
        System.out.print("Digite M: ");
        int m = sc.nextInt();
        System.out.print("Digite N: ");
        int n = sc.nextInt();

        // Crio a matriz do tamanho escolhido
        int[][] matriz = new int[m][n];

        // Preencho a matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Coleto valor de x
        System.out.println("Agora, digite um número que tem na matriz: ");
        int x = sc.nextInt();

        // Procuro por x e imprimo os adjacentes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição [" + i + "][" + j + "] encontrado:");

                    // Verifica os adjacentes e imprime se existirem
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                }
            }
        }

        sc.close();
    }
}
