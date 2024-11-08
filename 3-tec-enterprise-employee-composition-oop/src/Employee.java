public class Employee {

    private int id;
    private String nome;
    private double salario;
    private int idade;
    private int enterpriseTime;

    private Enterprise enterprise;

    public Employee() {
    }

    public Employee(int id, String nome, double salario, int idade, int enterpriseTime, Enterprise enterprise) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.enterpriseTime = enterpriseTime;
        this.enterprise = enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEnterpriseTime() {
        return enterpriseTime;
    }

    public void setEnterpriseTime(int enterpriseTime) {
        this.enterpriseTime = enterpriseTime;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Id = " + getId() + ", Nome = " + getNome() + ", Salario = " + getSalario()
                + ", Idade = " + getIdade() + ", Tempo de empresa (em meses) = " + getEnterpriseTime() + ", Empresa afiliada = "
                + getEnterprise().getNome();
    }
}
