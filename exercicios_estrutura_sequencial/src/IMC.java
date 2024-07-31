import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu imc é :" + imc);

        if (imc < 14) {
            System.out.println("Desnutrição.");
        } else if (imc < 18.5 && imc > 14) {
            System.out.println("Baixo peso.");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Peso normal.");
        } else if (imc > 25 && imc < 29.9) {
            System.out.println("Excesso de peso.");
        } else if (imc > 30 && imc < 35) {
            System.out.println("Obesidade.");
        } else if (imc > 35) {
            System.out.println("Obesidade extrema.");
        }

        sc.close();
    }
}
