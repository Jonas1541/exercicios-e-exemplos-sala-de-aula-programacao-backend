import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("quantidade no estoque: ");
        int quantidade = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidade);
        
        System.out.println(p.toString());

        System.out.print("Quantos produtos serão adicionados? ");
        int adicao = sc.nextInt();

        p.adicionarProdutos(adicao);

        System.out.println(p.toString());

        System.out.print("Quantos serão removidos? ");
        int remocao = sc.nextInt();

        p.removerProdutos(remocao);

        System.out.println(p.toString());

        sc.close();
    }
}