import java.util.Scanner;

public class PositivoZeroNegativo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("Positivo!");
        } else if( n == 0) {
            System.out.println("Zero!");
        } else {
            System.out.println("Negativo!");
        }

        sc.close();
    }
}
