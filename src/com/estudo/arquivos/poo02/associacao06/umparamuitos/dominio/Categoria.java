package com.estudo.arquivos.poo02.associacao06.umparamuitos.dominio;

public class Categoria {
    private String nome;

    public Categoria(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
