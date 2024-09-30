public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Informações do Produto: nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + ", valorTotalEmEstoque = "
                + valorTotalEmEstoque();
    }
}
