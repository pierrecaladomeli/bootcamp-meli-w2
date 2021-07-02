import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor extends CLT{
    private static BigDecimal salarioBase = new BigDecimal(15000);
    private static double bonificacao = 0;

    public Diretor(String nome, String registro, Empresa empresa) {
        super(nome, registro, empresa, salarioBase, bonificacao);
    }

    @Override
    public void pagarSalario() {
        BigDecimal valorFinal = salarioBase.add(getEmpresa().getLucros().multiply(BigDecimal.valueOf(0.03)));
        valorFinal = valorFinal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("O salário pago é de: " + valorFinal);
    }



}
