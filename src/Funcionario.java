
public abstract class Funcionario {
    private String name;
    private String cpf;
    private double salarioBase;

    public Funcionario(String name, String cpf, double salarioBase) {
        this.name = name;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calculaBonificacao();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "name=" + name + ", cpf=" + cpf + ", salarioBase=" + salarioBase + '}';
    }
    
}
