import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Listas
        //Instanciação
        List<String> lista = new ArrayList<>();
        //Adicionar elementos
        lista.add("Jonas");
        lista.add("Felipe");
        //Remover elementos
        lista.remove("Felipe");

        //Percorrer lista
        for(String elemento : lista) {
            System.out.println(elemento);
        }

        //Criar lista de números inteiros usando a wrapper class Integer
        List<Integer> listaInt = new ArrayList<>();

        //Colocando 10 números na lista
        System.out.println("Preenchendo a lista");
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            listaInt.add(n);
        }

        System.out.println("Percorrendo a lista:");
        //Percorrendo a lista
        for(Integer n : listaInt) {
            System.out.println(n);
        }
        sc.close();
    }
}
