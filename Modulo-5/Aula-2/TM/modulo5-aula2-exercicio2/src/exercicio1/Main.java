package exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", 100.0);
        ContaCorrente cc2 = new ContaCorrente("54321", 200.0);

        cc.sacar(10);
        System.out.println("Valor depois de sacar 10: " + cc.getSaldo());


        cc.transferir(120, cc2);

        System.out.println("Valores após tentar transferir 120 (tem só 90 na conta) de uma conta para outra:");
        System.out.println("Saldo cc: " + cc.getSaldo());
        System.out.println("Saldo cc2: " + cc2.getSaldo());

        ContaCorrente cc3 = new ContaCorrente(cc2);

        System.out.println("Nova conta baseada em cc2:");
        System.out.println("Saldo :" + cc3.getSaldo());

        cc.pedirDevolucao(300, cc3);
        System.out.println(cc.getSaldo());
        System.out.println(cc3.getSaldo());


    }




}
