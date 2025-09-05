package com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private final String nome;
    private final List<Estado> estados;

    public Pais(String nome) {
        this.nome = nome;
        this.estados = new ArrayList<>();
    }
    public void addEstados(Estado estado){
        estados.add(estado);
        estado.setPais(this);
    }

    public String getNome() {
        return nome;
    }
    public List<Estado> getEstados() {
        return estados;
    }
}
