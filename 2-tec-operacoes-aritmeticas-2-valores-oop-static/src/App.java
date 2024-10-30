import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Loop while pra repetir o programa enquanto o usuário não disser "n"
        String resposta = null;
        do {
            //Apresentando as opções de operação
        System.out.println("Lista de opções:");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        System.out.print("Selecione a operação: ");
        //Obtendo a opção escolhida
        int operacao = sc.nextInt();
        //Verificação de valor da operação (pra não permitir valores inválidos)
        while(operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
            System.out.println("Operação inválida! Digite um valor válido: ");
            operacao = sc.nextInt();
        }
        //Obtendo os valores pra realizar a operação
        System.out.print("Digite o 1° valor: ");
        double a = sc.nextDouble();
        System.out.print("Digite o 2° valor: ");
        double b = sc.nextDouble();

        //Realizando a operação escolhida
        if(operacao == 1) {
            double result = Calculadora.soma(a, b);
            System.out.println("O resultado da soma é: " + result);
        } else if(operacao == 2) {
            double result = Calculadora.subtracao(a, b);
            System.out.println("O resultado da subtração é: " + result);
        } else if(operacao == 3) {
            double result = Calculadora.multiplicacao(a, b);
            System.out.println("O resultado da multiplicação é: " + result);
        } else if(operacao == 4) {
            double result = Calculadora.divisao(a, b);
            System.out.println("O resultado da divisão é: " + result);
        }

        //Perguntando se o usuário deseja fazer outra operação
        System.out.println("Deseja realizar outra operação? (s/n)");
        //Consumo da linha pra limpar o buffer
        sc.nextLine();
        resposta = sc.nextLine();
        //Enquanto a resposta for "s" o código repete
        } while(resposta.equalsIgnoreCase("s"));

        sc.close();
    }
}
