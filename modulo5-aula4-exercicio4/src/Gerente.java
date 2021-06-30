import java.math.BigDecimal;

public class Gerente extends CLT{
    private static BigDecimal salarioBase = new BigDecimal(6000);
    private static double bonificacao = 0.125;
    private static int jornadaSemanal = 36;
    private static int descansoSemanal = 4;

    public Gerente(String nome, String registro, Empresa empresa) {
        super(nome, registro, empresa, salarioBase, bonificacao);
    }



}
