import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if(idade > 0 && idade <= 12) {
            System.out.println("Criança!");
        } else if(idade > 12 && idade <= 17) {
            System.out.println("Adolescente!");
        } else if(idade > 17 && idade <= 64) {
            System.out.println("Adulto!");
        } else if(idade > 64 && idade <= 110) {
            System.out.println("Idoso!");
        } else {
            System.out.println("Idade Inválida!");
        }

        sc.close();
    }
}
