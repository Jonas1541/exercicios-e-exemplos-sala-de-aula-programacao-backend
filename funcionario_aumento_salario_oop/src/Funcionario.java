public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    double salarioLiquido() {
        return salarioBruto - imposto;
    }

    void aumentarSalario(double porcentagem) {
        double aumento = porcentagem/100 * salarioBruto;
        this.salarioBruto += aumento;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", $ " + salarioLiquido();
    }
}
