//Import do Scanner pra podermos usá-lo. Se o VSCode estiver funcional, ele faz automaticamente.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Instânciação do Scanner para ler valores do usuário
        Scanner sc = new Scanner(System.in);

        //Mensagem no terminal pelo sout para guiar o usuário
        System.out.print("Digite o 1° valor: ");
        //Coleta de valor digitado em uma variável
        int n1 = sc.nextInt();
        //Mesma coisa, repita com quantas variáveis o exercício precisar
        System.out.print("Digite o 2° valor: ");
        int n2 = sc.nextInt();

        //Variável que armazena o cálculo que o exercício quer, nesse caso, uma média.
        //O processo é o mesmo para qualquer tipo de cálculo, mudando apenas o cálculo em si
        int media = (n1 + n2) / 2;

        //Utilizamos o sout de novo para mostrar o resultado que o exercício exige.
        System.out.println("A média desses valores é: " + media);

        //Fechamento do Scanner. Opcional mas é uma boa prática.
        sc.close();
    }
}
