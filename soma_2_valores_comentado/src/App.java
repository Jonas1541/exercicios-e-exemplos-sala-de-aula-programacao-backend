//Importando o Scanner pra poder usar na função main
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Instânciação do Scanner pra ler dados do usuário
        Scanner sc = new Scanner(System.in);
        //Digita mensagem pro usuário
        System.out.print("Digite o 1° número: ");
        //Lê número do usuário e armazena em a
        double a = sc.nextDouble();
        System.out.print("Digite o 2° número: ");
        double b = sc.nextDouble();
        //Váriável auxiliar que recebe a soma dos valores
        double soma = a + b;
        System.out.println("Soma = " + soma);
        sc.close();
    }
}
