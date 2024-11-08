import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private int id;
    private String nome;
    private String cnpj;

    private List<Employee> employees = new ArrayList<>();

    public Enterprise() {
    }

    public Enterprise(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Id = " + getId() + ", Nome = " + getNome() + ", CNPJ = " + getCnpj();
    }   
}
