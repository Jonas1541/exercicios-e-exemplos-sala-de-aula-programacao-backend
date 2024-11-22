import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar? ");
        double preco = sc.nextDouble();

        System.out.println("Quantos dolares serão comprados?");
        double quantidade = sc.nextDouble();

        System.out.println("Preço em reais: " + CurrencyConverter.conversao(preco, quantidade));

        sc.close();
    }
}
