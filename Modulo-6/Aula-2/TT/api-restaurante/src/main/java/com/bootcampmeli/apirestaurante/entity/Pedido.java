package com.bootcampmeli.apirestaurante.entity;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private long id;
    private Mesa mesa;
    private List<Prato> listaPratos;

    public Pedido() {
    }

    public Pedido(long id, Mesa mesa, List<Prato> listaPratos) {
        this.id = id;
        this.mesa = mesa;
        this.listaPratos = listaPratos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Prato> getListaPratos() {
        return listaPratos;
    }

    public void setListaPratos(List<Prato> listaPratos) {
        this.listaPratos = listaPratos;
    }

    public BigDecimal getValorTotal() {
        return listaPratos.stream().map(x -> x.getPreco().
                multiply(BigDecimal.valueOf(x.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
