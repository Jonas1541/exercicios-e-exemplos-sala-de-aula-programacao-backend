import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Instância de matriz
        int[][] matriz = new int[4][3];

        //Tamanho da matriz
        System.out.println("N° de linhas: " + matriz.length);
        System.out.println("N° de colunas: " + matriz[0].length);

        //Percorrer matriz
        for(int i = 0; i < matriz.length; i++) {
            for(int ii = 0; ii < matriz[0].length; ii++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + ii + "]");
                matriz[i][ii] = sc.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int ii = 0; ii < matriz[0].length; ii++) {
                System.out.println(matriz[i][ii]);
            }
        }
        sc.close();
    }
}
