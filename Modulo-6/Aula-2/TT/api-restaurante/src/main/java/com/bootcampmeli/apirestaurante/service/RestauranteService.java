package com.bootcampmeli.apirestaurante.service;

import com.bootcampmeli.apirestaurante.entity.Mesa;
import com.bootcampmeli.apirestaurante.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class RestauranteService {

    private RestauranteRepository repository;

    @Autowired
    public RestauranteService(RestauranteRepository repository) {
        this.repository = repository;

    }

    public List<Mesa> retornaMesas(){
        return repository.retornaMesas();
    }

    public BigDecimal retornaValorCaixa(){
        return repository.retornaValorCaixa();
    }

    public Mesa consultaMesa(long id) {
        return repository.consultaMesa(id);
    }

    public void fecharPedido(long id) {
        Mesa mesa = consultaMesa(id);

        repository.adicionarAoCaixa(mesa.getValorTotal());

        mesa.setListaPedidos(new ArrayList<>());

        repository.salvarMesasJSON();
    }



/*    public void cadastra(Anuncio anuncio) {
        if(anuncio.getDescricao().length() < 3)
            throw new RuntimeException("O anuncio deve ter no mínimo 3 caracteres");
        repository.add(anuncio);
    }

    public List<Anuncio> listar(){
        return repository.getList();
    }

    public AnuncioService() {

    }

    @Autowired
    public AnuncioService(AnuncioRepository repository) {
        this.repository = repository;

    }*/
}
