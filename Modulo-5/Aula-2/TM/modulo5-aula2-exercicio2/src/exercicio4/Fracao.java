package exercicio4;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public static Fracao adicionar (Fracao fracao1, Fracao fracao2){
        int numeradorFinal = 1;
        int denominadorFinal = 1;

        if (fracao1.getDenominador() == fracao2.getDenominador()) {
            numeradorFinal = fracao1.getNumerador() + fracao2.getNumerador();
            denominadorFinal = fracao1.getDenominador();
        } else {
            numeradorFinal = (fracao1.getNumerador() * fracao2.getDenominador()) + (fracao2.getNumerador() * fracao1.getDenominador());
            denominadorFinal = fracao1.getDenominador() * fracao2.getDenominador();
        }
        return new Fracao(numeradorFinal, denominadorFinal);
    }

    public static Fracao adicionar (Fracao fracao, int inteiro){
        Fracao fracaoPorInteiro = new Fracao(inteiro, 1);

        return adicionar(fracao,fracaoPorInteiro);
    }

    public static Fracao subtrair (Fracao fracao1, Fracao fracao2){
        int numeradorFinal = 1;
        int denominadorFinal = 1;

        if (fracao1.getDenominador() == fracao2.getDenominador()) {
            numeradorFinal = fracao1.getNumerador() - fracao2.getNumerador();
            denominadorFinal = fracao1.getDenominador();
        } else {
            numeradorFinal = (fracao1.getNumerador() * fracao2.getDenominador()) - (fracao2.getNumerador() * fracao1.getDenominador());
            denominadorFinal = fracao1.getDenominador() * fracao2.getDenominador();
        }
        return new Fracao(numeradorFinal, denominadorFinal);
    }

    public static Fracao subtrair (Fracao fracao, int inteiro){
        Fracao fracaoPorInteiro = new Fracao(inteiro, 1);

        return subtrair(fracao,fracaoPorInteiro);
    }

    public static Fracao multiplicar (Fracao fracao1, Fracao fracao2){
        int numeradorFinal = 1;
        int denominadorFinal = 1;

        numeradorFinal = fracao1.getNumerador() * fracao2.getNumerador();

        if (fracao1.getDenominador() == fracao2.getDenominador()) {
            denominadorFinal = fracao1.getDenominador();
        } else {
            denominadorFinal = fracao1.getDenominador() * fracao2.getDenominador();
        }
        return new Fracao(numeradorFinal,denominadorFinal);
    }

    public static Fracao multiplicar (Fracao fracao, int inteiro) {
        Fracao fracaoPorInteiro = new Fracao(inteiro, 1);

        return multiplicar(fracao, fracaoPorInteiro);

    }

    public static Fracao dividir (Fracao fracao1, Fracao fracao2) {
        Fracao fracaoInvertida = new Fracao(fracao2.getDenominador(), fracao2.getNumerador());
        return multiplicar(fracao1, fracaoInvertida);
    }

    public static Fracao dividir (Fracao fracao1, int inteiro){
        Fracao fracaoPorInteiro = new Fracao(inteiro, 1);
        return dividir(fracao1, fracaoPorInteiro);
    }


    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
