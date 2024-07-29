import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private LocalDate nascimento;
    
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf, LocalDate nascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", nascimento=" + nascimento + "]";
    }
}
