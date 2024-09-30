import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println(produto.toString());

        System.out.print("Adicione produtos em estoque: ");
        int adicao = sc.nextInt();
        produto.adicionarProdutos(adicao);

        System.out.println(produto.toString());

        System.out.print("Remova produtos do estoque: ");
        int remocao = sc.nextInt();
        produto.removerProdutos(remocao);
        System.out.println(produto.toString());

        sc.close();
    }
}
