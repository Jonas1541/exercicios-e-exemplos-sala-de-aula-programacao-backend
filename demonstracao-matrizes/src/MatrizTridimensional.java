import java.util.Scanner;

public class MatrizTridimensional {
    public static void main(String[] args) {
        //Já que o Guilherme pediu, aqui está uma demonstração de uma matriz tridimensional
        //Espero que esteja feliz agora
        Scanner sc = new Scanner(System.in);
        // Instância de matriz
        int[][][] matriz = new int[2][2][2];

        // Tamanho da matriz
        System.out.println("N° de linhas: " + matriz.length);
        System.out.println("N° de colunas: " + matriz[0].length);
        System.out.println("N° do volume: " + matriz[0][0].length);

        // Percorrer matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int ii = 0; ii < matriz[0].length; ii++) {
                for (int iii = 0; iii < matriz[0][0].length; iii++) {
                    System.out.print("Digite o valor para a posição [" + i + "][" + ii + "]" + "[" + iii + "]: ");
                    matriz[i][ii][iii] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Camada " + (i + 1) + ":");
            for (int ii = 0; ii < matriz[i].length; ii++) {
                for (int iii = 0; iii < matriz[i][ii].length; iii++) {
                    System.out.print(matriz[i][ii][iii] + " ");
                }
                System.out.println(); // Pula linha ao final de cada linha da matriz bidimensional
            }
            System.out.println(); // Pula linha ao final de cada camada tridimensional
        }

        sc.close();
    }
}
