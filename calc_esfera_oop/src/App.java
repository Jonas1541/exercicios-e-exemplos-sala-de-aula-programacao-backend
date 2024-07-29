import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        double circinferência = Calculadora.circunferencia(raio);
        double volume = Calculadora.volume(raio);
        System.out.println("A circinferência é: " + circinferência);
        System.out.println("O volume é: " + volume);
        sc.close();
    }
}
