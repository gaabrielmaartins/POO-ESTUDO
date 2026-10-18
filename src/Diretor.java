
public class Diretor extends Gerente{

    public Diretor(int senha, int numeroDeFuncionariosGerenciados, String name, String cpf, double salarioBase) {
        super(senha, numeroDeFuncionariosGerenciados, name, cpf, salarioBase);
    }
    
    @Override
    public double calculaBonificacao(){
        return super.calculaBonificacao() + 2000.0;
    }
    
}
