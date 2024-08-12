import java.util.Scanner;

public class SegundoPraHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de tempo em segundos: ");
        int segundos = sc.nextInt();

        int minutos = segundos / 60;
        double horas = (double) minutos / 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        sc.close();
    }
}
