import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Instanciação
        int[] vetor = {1,2,3,4};
        String[] vetor2 = new String[2];

        //Preenchimento de vetores vazios
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            vetor2[i] = sc.nextLine();
        }
        sc.close();

        System.out.println();
        //Visualizando o vetor
        for(int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
    }
}
