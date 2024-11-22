import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Formas de instanciar
        int[] vetorPreenchido = {1,2,3};
        int[] vetorVazio = new int[3];

        //Formas de acessar
        int a = vetorPreenchido[2]; // a recebe o valor que reside na posição "2"
        System.out.println(a);

        //Preencher vetor vazio manualmente
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vetorVazio.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor:");
            vetorVazio[i] = sc.nextInt();
        }

        //Imprimir todos os valores de um vetor na tela
        for(int i = 0; i < vetorVazio.length; i++) {
            System.out.println(vetorVazio[i]);
        }

        sc.close();
    }
}
