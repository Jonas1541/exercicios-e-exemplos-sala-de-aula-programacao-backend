import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String senha = "batata";

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();
        /*
         * while(!(senha.equals(senhaDigitada))) {
         * System.out.println("Senha inválida!");
         * System.out.print("Digite novamente: ");
         * senhaDigitada = sc.nextLine();
         * }
         */
        //Começamos do 9 pq ele vai até 0
        for (int i = 9; i >= 1; i--) {

            if (senhaDigitada.length() > 10) {
                System.out.println("Senha muito grande!");
                System.out.println("Tentativas restantes: " + i);
                System.out.print("Digite novamente: ");
                senhaDigitada = sc.nextLine();
            } else if (!(senha.equals(senhaDigitada))) {

                System.out.println("Senha inválida!");
                System.out.println("Tentativas restantes: " + i);
                System.out.print("Digite novamente: ");
                senhaDigitada = sc.nextLine();
            }
        }
        if (!(senha.equals(senhaDigitada))) {
            System.out.println("Tentativas esgotadas!");
        } else {
            System.out.println("Senha correta!");
        }
        sc.close();
    }
}
