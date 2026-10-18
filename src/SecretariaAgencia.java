
public class SecretariaAgencia extends Secretaria{

    public SecretariaAgencia(String name, String cpf, double salarioBase) {
        super(name, cpf, salarioBase);
    }
    
    @Override
    public double calculaBonificacao() {
        return super.getSalarioBase() * 0.1 + 500.0;
    }
    
}
