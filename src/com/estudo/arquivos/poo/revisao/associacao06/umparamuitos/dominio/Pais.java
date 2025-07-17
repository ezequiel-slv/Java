package com.estudo.arquivos.poo.revisao.associacao06.umparamuitos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private List<Estado> estados;

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
