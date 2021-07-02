import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CLT extends Funcionario{
    private BigDecimal salarioBase;
    private double bonificacao;

    public CLT(String nome, String registro, Empresa empresa, BigDecimal salarioBase, double bonificacao) {
        super(nome, registro, empresa);
        this.salarioBase = salarioBase;
        this.bonificacao = bonificacao;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public void pagarSalario() {
        BigDecimal valorFinal = salarioBase.add(salarioBase.multiply(BigDecimal.valueOf(bonificacao * getEmpresa().getMetasBatidas())));
        valorFinal = valorFinal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("O salário pago é de: " + valorFinal);
    }
}
