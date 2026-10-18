
public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente(123, 10, "Gerente", "111.111.111-55", 5000.00);
        Presidente p = new Presidente (15000.0, "Presidente", "222.222.222-00", 15000.0);
        Diretor d = new Diretor(321, 11, "Diretor", "333.333.333-33", 8000.0);
        SecretariaAdm sadm = new SecretariaAdm ("Juanete", "444.444.444-44", 3000.0);
        SecretariaAgencia scag = new SecretariaAgencia ("Janete", "555.555.555-55", 3000.0);
        
        ControleDeBonificacoes ct = new ControleDeBonificacoes();
        
        ct.registra(g);
        ct.registra(p);
        ct.registra(d);
        ct.registra(sadm);
        ct.registra(scag);
        
        System.out.println(ct.getTotalDeBonificacoes());
    }
}
