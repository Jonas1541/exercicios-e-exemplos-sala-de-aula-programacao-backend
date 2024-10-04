import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Digite o lado do retângulo: ");
        double lado = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(lado, altura);
        
        System.out.println("Área: " + retangulo.area());
        System.out.println("Perímetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());
        
        sc.close();
    }
}
