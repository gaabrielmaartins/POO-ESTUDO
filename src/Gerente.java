
public class Gerente extends Funcionario{
    
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(int senha, int numeroDeFuncionariosGerenciados, String name, String cpf, double salarioBase) {
        super(name, cpf, salarioBase);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    @Override
    public double calculaBonificacao(){
        return getSalarioBase() * 0.15 + 1000.0;
    }
    
}
