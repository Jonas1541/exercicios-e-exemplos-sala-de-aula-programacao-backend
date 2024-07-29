import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Jonas", 22, "99999999999", LocalDate.of(2001, 0, 21));
        Produto produto = new Produto();
        Produto produto2 = new Produto(1, 45.90, 3);
        System.out.println("Pessoa vazia: " + pessoa.toString());
        System.out.println("Pessoa preenchida: " + pessoa2.toString());
        System.out.println("Produto vazio: " + produto.toString());
        System.out.println("Produto preenchido: " + produto2.toString());
    }
}
