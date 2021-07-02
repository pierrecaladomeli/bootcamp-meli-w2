import java.math.BigDecimal;

public class Tecnico extends CLT{
    private static BigDecimal salarioBase = new BigDecimal(3200);
    private static double bonificacao = 0.05;
    private static int jornadaSemanal = 40;
    private static int descansoSemanal = 0;

    public Tecnico(String nome, String registro, Empresa empresa) {
        super(nome, registro, empresa, salarioBase, bonificacao);
    }



}
