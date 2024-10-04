import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Criação do Scanner pra ler os dados do retângulo
        Scanner sc = new Scanner(System.in);

        //Obtenção dos dados do retângulo
        System.out.print("Digite largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        //Criação do retângulo com os dados passados
        Retangulo retangulo = new Retangulo(largura, altura);

        //Utilização dos métodos do retângulo
        System.out.println("Área: " + retangulo.area());
        System.out.println("Perímetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());

        //Fechamento do Scanner após o uso
        sc.close();
    }
}
