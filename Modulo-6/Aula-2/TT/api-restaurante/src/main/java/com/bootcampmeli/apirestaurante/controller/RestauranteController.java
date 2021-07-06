package com.bootcampmeli.apirestaurante.controller;

import com.bootcampmeli.apirestaurante.entity.Mesa;
import com.bootcampmeli.apirestaurante.entity.Pedido;
import com.bootcampmeli.apirestaurante.entity.Prato;
import com.bootcampmeli.apirestaurante.service.RestauranteService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @RequestMapping("/mesas")
    private List<Mesa> listaMesas(){
        return restauranteService.retornaMesas();
    }

    @RequestMapping("/mesas/{id}")
    private Mesa consultaMesa(@PathVariable long id){
        return restauranteService.consultaMesa(id);
    }

    @RequestMapping("/mesas/{id}/fechar-pedido")
    private String fecharPedido(@PathVariable long id){
        restauranteService.fecharPedido(id);
        return "Pedidos da Mesa: " + id + " foram fechados.";
    }

    @RequestMapping("/caixa")
    public String consultaCaixa() {
        BigDecimal caixa = restauranteService.retornaValorCaixa();
        return "Valor atual em caixa: " + caixa;
    }

}
