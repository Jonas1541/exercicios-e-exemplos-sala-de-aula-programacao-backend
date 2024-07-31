import java.util.Scanner;

public class Media3Numeros {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3° número: ");
        int n3 = sc.nextInt();

        int media = (n1 + n2 + n3) / 3;

        System.out.println("A média é: " + media);

        sc.close();
    }
}
