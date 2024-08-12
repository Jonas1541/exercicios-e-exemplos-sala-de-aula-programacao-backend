import java.util.Scanner;

public class NotaNumeroConceito {

    /*
     * Desenvolva um programa que receba uma nota (0-100) e classifique-a como: A
     * (90-100), B (80-89), C (70-79), D (60-69), F (0-59).
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("B");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("C");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("D");
        } else if (nota >= 0 && nota <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Nota inválida!");
        }

        sc.close();
    }
}
