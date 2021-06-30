import java.math.BigDecimal;
import java.math.RoundingMode;

public class PJ extends Funcionario{

    private int horasTrabalhadas;
    private BigDecimal valorHora;

    public PJ(String nome, String registro, Empresa empresa, int horasTrabalhadas, BigDecimal valorHora) {
        super(nome, registro, empresa);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }


    @Override
    public void pagarSalario() {
        BigDecimal valorFinal = valorHora.multiply(BigDecimal.valueOf(horasTrabalhadas));
        valorFinal = valorFinal.setScale(2, RoundingMode.HALF_UP);

        System.out.println("O salário pago é de: " + valorFinal);
    }
}
