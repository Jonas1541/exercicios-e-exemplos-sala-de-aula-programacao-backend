import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Vetores
        //Instânciação
        //Vetor vazio
        int[] vetor = new int[3];
        //Vetor preenchido
        String[] vetor2 = {"Jonas", "Felipe"};

        System.out.println("Preenchendo vetor vazio:");
        //Preencher vetor vazio
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Posição [" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Percorrendo vetor:");
        //Percorrer vetores
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println();
        System.out.println("Percorrendo vetor de texto");
        for(int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
        sc.close();
    }
}
