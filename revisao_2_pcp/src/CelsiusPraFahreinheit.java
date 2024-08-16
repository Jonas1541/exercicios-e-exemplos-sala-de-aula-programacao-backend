import java.util.Scanner;

public class CelsiusPraFahreinheit {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        int celsius = sc.nextInt();

        double fahrenheint = celsius * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheint);

        sc.close();
    }
}
