package com.bootcampmeli.apirestaurante.entity;

import java.math.BigDecimal;
import java.util.List;

public class Mesa {

    private long id;
    private List<Pedido> listaPedidos;

    public Mesa() {
    }

    public Mesa(long id, List<Pedido> listaPedidos) {
        this.id = id;
        this.listaPedidos = listaPedidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public BigDecimal getValorTotal() {
        return listaPedidos.stream().map(x -> x.getValorTotal()).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
