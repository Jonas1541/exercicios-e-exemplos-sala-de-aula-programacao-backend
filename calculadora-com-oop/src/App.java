import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        //Utilização dos métodos da classe Calculadora, sem necessidade de Instância
        System.out.println("Circunferência: " + Calculadora.circunferencia(raio));

        System.out.println("Área: " + Calculadora.area(raio));

        System.out.println("valor de PI: " + Calculadora.PI);

        sc.close();
    }
}
