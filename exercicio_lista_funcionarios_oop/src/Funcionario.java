public class Funcionario {

    //Atributos do funcionário
    private int id;
    private String name;
    private double salary;

    //Construtores sem e com argumentos pra instanciação dos funcionários
    public Funcionario() {
    }

    public Funcionario(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Getters e Setters dos atributos privados
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Função de aumentar salário, regra de negócio
    public void aumentarSalario(double porcentagem) {
        this.salary += (porcentagem*salary) / 100;
    }

    //toString pra imprimir as informações do funcionário quando a função é chamada
    @Override
    public String toString() {
        return "id = " + getId() + ", name = " + getName() + ", salary = " + getSalary();
    }
}