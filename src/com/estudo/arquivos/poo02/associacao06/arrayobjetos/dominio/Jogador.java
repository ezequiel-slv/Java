package com.estudo.arquivos.poo02.associacao06.arrayobjetos.dominio;

public class Jogador {
    private String nome;

    public void imprime(){
        System.out.println(nome);
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}
