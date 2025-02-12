package com.estudo.arquivos.poo.introducaometodos.dominio;

public class Pessoa {
    private int idade;
    private String nome;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}


