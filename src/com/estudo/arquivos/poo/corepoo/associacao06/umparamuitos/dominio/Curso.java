package com.estudo.arquivos.poo.corepoo.associacao06.umparamuitos.dominio;

public class Curso {
    private String nome;

    public Curso(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
