import java.util.Scanner;

public class LerNaMesmaLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();
        sc.nextLine();

        //Criação da matriz de tamanho n
        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++) {
            System.out.println("Preencha a " + (i + 1) + "° linha de termos separados por espaço:");
            String termos = sc.nextLine();  // Lê a linha com os termos separados por espaço
            String[] vetorStr = termos.split(" ");  // Divide a string em um array de Strings

            for(int ii = 0; ii < n; ii++) {
                matriz[i][ii] = Integer.parseInt(vetorStr[ii]);  // Converte cada string para inteiro e preenche a matriz
            }
        }

        int negativos = 0;

        //Conferindo a matriz
        for(int i = 0; i < n; i++) {
            for(int ii = 0; ii < n; ii++) {
                System.out.print("Posição [" + i + "][" + ii + "]: ");
                System.out.println(matriz[i][ii]);
                if(matriz[i][ii] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println("Diagonal principal:");

        for(int i = 0; i < n; i++) {
            for(int ii = 0; ii < n; ii++) {
                if(i == ii) {
                    System.out.println(matriz[i][ii]);
                }
            }
        }

        System.out.println("Quantidade de negativos: " + negativos);

        sc.close();
    }
}
