import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Filme permitido apenas para +18.");
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if(idade >= 18) {
            System.out.println("Pode entrar.");
        } else {
            System.out.println("Você não tem a idade necessária.");
        }
        sc.close();
    }
}
