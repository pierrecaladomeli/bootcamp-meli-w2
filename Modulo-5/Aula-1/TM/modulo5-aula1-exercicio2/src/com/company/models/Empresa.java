package com.company.models;

public class Empresa {
    private String nome;
    private double valor;
    private double crescimentoAnual;

    public Empresa(String nome, double valor, double crescimentoAnual) {
        this.nome = nome;
        this.valor = valor;
        this.crescimentoAnual = crescimentoAnual;
    }

    public Empresa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCrescimentoAnual() {
        return crescimentoAnual;
    }

    public void setCrescimentoAnual(double crescimentoAnual) {
        this.crescimentoAnual = crescimentoAnual;
    }
}
