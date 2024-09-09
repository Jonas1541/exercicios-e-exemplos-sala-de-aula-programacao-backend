import java.util.Scanner;

public class Senha {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while(senha != senhaCorreta) {
            System.out.println("Senha invalida!");
            System.out.println("Digite novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido.");

        sc.close();
    }
}
