import java.util.Scanner;

public class Batata {
    public static void main(String[] args) throws Exception {
        // Comando de escrever no terminal
        // System.out.println("linha 1");
        // System.out.println("linha 2");

        // Variável de armazenamento de números inteiros: int
        // int a = 10;

        // Variável de armazenamento de texto: String
        // String txt = "Valor inicial do a: ";

        // Variável de armazenamento de números com vírgula: double
        // double b = 10.6;

        // Concatenação
        // System.out.println(txt + a);

        // a = 5;

        // System.out.println("Segundo valor do a: " + a);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação que você quer (+, -, *, /): ");
        String tipo = sc.nextLine();
        if (!("+".equals(tipo) || "-".equals(tipo) || "*".equals(tipo) || "/".equals(tipo))) {
            System.out.println("Tipo de operação inválido");
            sc.close();
            return;
        }
        System.out.print("Digite o 1° valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o 2° valor: ");
        int b = sc.nextInt();

        if (tipo.equals("+")) {
            int operacao = a + b;
            System.out.println("O resultado da operacao é: " + operacao);
        } else if (tipo.equals("-")) {
            int operacao = a - b;
            System.out.println("O resultado da subtração é: " + operacao);
        } else if (tipo.equals("*")) {
            int operacao = a * b;
            System.out.println("O resultado da multiplicação é: " + operacao);
        } else if (tipo.equals("/")) {
            double operacao = (double) a / b;
            System.out.println("O resultado da divisão é: " + operacao);
        }
        sc.close();
    }
}
