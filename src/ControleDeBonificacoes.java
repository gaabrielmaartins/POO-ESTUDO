
public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0.0;

    public ControleDeBonificacoes() {
    }
    
    public double registra(Funcionario f){
        return this.totalDeBonificacoes += f.calculaBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }

    public void setTotalDeBonificacoes(double totalDeBonificacoes) {
        this.totalDeBonificacoes = totalDeBonificacoes;
    }
    
}
