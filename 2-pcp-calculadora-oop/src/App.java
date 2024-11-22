import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");

        int escolha = sc.nextInt();

        System.out.print("Digite o 1° número da operação: ");
        double a = sc.nextDouble();
        System.out.print("Digite o 2° número da operação: ");
        double b = sc.nextDouble();

        if(escolha == 1) {
            System.out.println(Calculadora.soma(a, b));
        } else if(escolha == 2) {
            System.out.println(Calculadora.subtracao(a, b));
        } else if(escolha == 3) {
            System.out.println(Calculadora.multiplicacao(a, b));
        } else if(escolha == 4) {
            System.out.println(Calculadora.divisao(a, b));
        } else 
        sc.close();
    }
}
