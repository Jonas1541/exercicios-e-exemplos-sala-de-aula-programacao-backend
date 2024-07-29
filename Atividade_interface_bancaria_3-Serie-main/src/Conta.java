public class Conta {
    //Atributos da classe
    //Eles são privados para não permitir alteração livre, esse é o padrão
    private int numero;
    private String nome;
    private double saldo;

    //Construtor que inicia com saldo 0
    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    //Construtor que inicia com saldo customizado
    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    //Métodos Get pra acesso das informações
    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    //Métodos Set pra alteração dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Métodos de deposito e saque seguindo a regra de negócio do banco
    public void deposito(double valor) {
        this.saldo += valor;
    }
    public void saque(double valor) {
        this.saldo -= valor;
    }
    //Método toString usado pra mostrar as informações da classe mais facilmente.
    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + "]";
    }
    
}
