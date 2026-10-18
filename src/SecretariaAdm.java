
public class SecretariaAdm extends Secretaria {

    public SecretariaAdm(String name, String cpf, double salarioBase) {
        super(name, cpf, salarioBase);
    }

    @Override
    public double calculaBonificacao() {
        return super.getSalarioBase() * 0.1 + 300.0;
    }
}
