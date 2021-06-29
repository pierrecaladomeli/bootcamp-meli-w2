package exercicio1;

public class ContaCorrente {
    private String id;
    private double saldo;

    public ContaCorrente(String id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.id = contaCorrente.getId();
        this.saldo = contaCorrente.getSaldo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double sacar(double valor){
        if (saldo < valor) {
            valor = saldo;
        }

        saldo -= valor;
        return valor;
    }

    public void transferir(double valor, ContaCorrente contaCorrente) {
        double valorTransferencia = sacar(valor);
        contaCorrente.depositar(valorTransferencia);
    }

    public void pedirDevolucao(double valor, ContaCorrente contaCorrente) {
        double valorDevolucao = contaCorrente.sacar(valor);
        this.depositar(valorDevolucao);
    }
}
