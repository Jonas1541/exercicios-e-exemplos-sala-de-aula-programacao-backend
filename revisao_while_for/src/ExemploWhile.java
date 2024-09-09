import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int soma = 0;
        while(n != 0){
            System.out.println("Você digitou: " + n);
            System.out.print("Digite mais um número: ");
            n = sc.nextInt();
            soma += n;
        }
        System.out.println("Você digitou 0. E a soma dos números foi: " + soma);

        sc.close();
    }
}
