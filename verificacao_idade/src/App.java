import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        //Estrutura condicional
        if(idade < 18 && idade > 0) {
            System.out.println("Criança!");
        } else if(idade >= 18 && idade < 56) {
            System.out.println("Adulto!");
        } else if(idade >= 56 && idade < 120) {
            System.out.println("Véio!");
        } else {
            System.out.println("Idade inválida!");
        }

        sc.close();
    }
}
