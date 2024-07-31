import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vc quer converter pra qual? ");
        String tipo = sc.nextLine();

        if (tipo.equalsIgnoreCase("celsius")) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (fahrenheit - 32) / 1.8;

            System.out.println("A temperatura em celsius é: " + celsius);
        } else {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 1.8) + 32;

            System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
        }
        sc.close();
    }
}
