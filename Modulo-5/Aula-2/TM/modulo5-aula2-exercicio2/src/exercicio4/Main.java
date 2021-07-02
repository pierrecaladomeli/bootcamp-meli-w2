package exercicio4;

public class Main {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(2,1);
        Fracao fracao2 = new Fracao(1,2);
        int inteiro = 5;

        Fracao resposta = Fracao.adicionar(fracao1, fracao2);
        System.out.println("A soma de " + fracao1 + " com " + fracao2 + " é: " + resposta);

        resposta = Fracao.adicionar(fracao1, inteiro);
        System.out.println("A soma de " + fracao1 + " com " + inteiro + " é: " + resposta);

        resposta = Fracao.multiplicar(fracao1, fracao2);
        System.out.println("A multiplicação de " + fracao1 + " com " + fracao2 + " é: " + resposta);

        resposta = Fracao.dividir(fracao1,fracao2);
        System.out.println("A divisão de " + fracao1 + " com " + fracao2 + " é: " + resposta);

    }
}
