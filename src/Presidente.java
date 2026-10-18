
public class Presidente extends Funcionario {

    private double valorCotaAcoes;

    public Presidente(double valorCotaAcoes, String name, String cpf, double salarioBase) {
        super(name, cpf, salarioBase);
        this.valorCotaAcoes = valorCotaAcoes;
    }
    
    @Override
    public double calculaBonificacao(){
        return getSalarioBase() * 0.30 + this.valorCotaAcoes;
    }
    
}
