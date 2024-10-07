import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instanciação
        double[][] matriz = new double[3][3];
        String[][] matriz2 = {{"Jonas", "Felipe"}, {"Guilherme", "Gustavo"}};

        //Preencher matriz vazia
        for(int i = 0; i < matriz.length; i++) {
            for(int ii = 0; ii < matriz[0].length; ii++) {
                System.out.print("Posição [" + i + "][" + ii + "]: ");
                matriz[i][ii] = sc.nextDouble();
            }
        }

        //Percorrer matrizes
        for(int i = 0; i < matriz.length; i++) {
            for(int ii = 0; ii < matriz[0].length; ii++) {
                System.out.println(matriz[i][ii]);
            }
        }

        for(int i = 0; i < matriz2.length; i++) {
            for(int ii = 0; ii < matriz2[0].length; ii++) {
                System.out.println(matriz2[i][ii]);
            }
        }
        sc.close();
    }
}
