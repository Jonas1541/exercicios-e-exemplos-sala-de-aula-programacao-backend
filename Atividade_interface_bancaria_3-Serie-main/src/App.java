import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Instância padrão do Scanner
        Scanner sc = new Scanner(System.in);
        //Obtenção das informações do usuário em variáveis auxiliares
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome da conta: ");
        String nome = sc.nextLine();
        //Perguntando ao usuário se ele deseja fazer um depósito inicial
        System.out.print("Deseja fazer um depósito inicial? (s/n)");
        String a = sc.next();
        sc.nextLine();
        //Declaração da classe Conta fora do if pra respeitar as questões de escopo de código
        Conta c;
        if(a.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor inicial: ");
            double valor = sc.nextDouble();
            //Instanciação de com depósito inicial
            c = new Conta(numero, nome, valor);
        } else {
            //Instanciação sem depósito inicial
            c = new Conta(numero, nome);
        }
        //Mostrando os dados da conta
        System.out.println("Dados da conta:");
        System.out.println(c.toString());
        //Operação de depósito
        System.out.print("Digite o valor do depósito: ");
        double valor = sc.nextDouble();
        c.deposito(valor);
        //Mostrando os dados da conta
        System.out.println("Valores atualizados:");
        System.out.println(c.toString());
        //Agora, resta fazer a operação de retirada e mostrar os dados da conta novamente
        
        sc.close();
    }
}
