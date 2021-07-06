package com.bootcampmeli.apirestaurante.repository;

import com.bootcampmeli.apirestaurante.entity.Mesa;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RestauranteRepository {


    private BigDecimal caixa = new BigDecimal(0);
    private List<Mesa> listaMesas = new ArrayList<>();

    private static final File FILE = new File("mesas.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Mesa> retornaMesas(){
        atualizaMesasFromJSON();
        return listaMesas;
    }

    public BigDecimal retornaValorCaixa() {
        return caixa;
    }

    public void adicionarAoCaixa(BigDecimal dinheiro){
            caixa = caixa.add(dinheiro);
    }

    public Mesa consultaMesa(long id) {
        atualizaMesasFromJSON();
        Mesa mesa = listaMesas.stream()
                .filter(x -> x.getId() == id)
                .reduce((a, b) -> {
                    throw new IllegalStateException("Multiple elements: " + a + ", " + b);
                })
                .get();
       return mesa;
    }

    public void salvarMesasJSON () {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, listaMesas);
            out.close();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
/*    public void add(Anuncio anuncio) {
        try {
            List<Anuncio> anuncios = getList();
            anuncios.add(anuncio);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, anuncios);
            out.close();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void atualizaMesasFromJSON(){
        List<Mesa> mesas = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Mesa>> typeReference = new TypeReference<List<Mesa>>() {};
            mesas = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        listaMesas = mesas;
    }
}
