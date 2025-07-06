package com.estudo.arquivos.poo.corepoo.associacao06.umparamuitos.dominio;

public class Time {
    private String nome;

    public Time(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
