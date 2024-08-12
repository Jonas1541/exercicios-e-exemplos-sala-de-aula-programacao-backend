import java.util.Scanner;

public class VogalOuConsoante {

    /*
     * Crie um programa que receba um caractere e determine se ele é uma vogal ou
     * uma consoante.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a letra: ");
        String letra = sc.next();

        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("É vogal.");
        } else {
            System.out.println("É consoante.");
        }

        sc.close();
    }
}
