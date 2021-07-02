import java.math.BigDecimal;

public class Analista extends CLT{
    private static BigDecimal salarioBase = new BigDecimal(4000);
    private static double bonificacao = 0.08;
    private static int jornadaSemanal = 40;
    private static int descansoSemanal = 4;

    public Analista(String nome, String registro, Empresa empresa) {
        super(nome, registro, empresa, salarioBase, bonificacao);
    }



}
