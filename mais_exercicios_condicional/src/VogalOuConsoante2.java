import java.util.Scanner;

public class VogalOuConsoante2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as letras: ");
        String txt = sc.nextLine();

        String[] v = txt.trim().split("");

        String vogal = "";
        String consoante = "";
        for (int i = 0; i < v.length; i++) {
            if (v[i].equalsIgnoreCase("a") || v[i].equalsIgnoreCase("e") || v[i].equalsIgnoreCase("i") || v[i].equalsIgnoreCase("o") || v[i].equalsIgnoreCase("u")) {
                vogal += " " + v[i];
            } else {
                consoante += " " + v[i];
            }
        }

        System.out.println("vogais: " + vogal);
        System.out.println("Consoantes: " + consoante);

        sc.close();
    }
}
