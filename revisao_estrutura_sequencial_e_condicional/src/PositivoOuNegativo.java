import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Negativo!");
        } else if(n > 0) {
            System.out.println("Positivo!");
        } else if(n == 0) {
            System.out.println("Zero!");
        } 

        sc.close();
    }
}
