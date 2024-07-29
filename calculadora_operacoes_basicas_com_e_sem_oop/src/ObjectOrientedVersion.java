import java.util.Scanner;

public class ObjectOrientedVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a operação completa: ");
        String operacao = sc.nextLine();
        Calculadora.calcular(operacao);

        sc.close();
    }
}
