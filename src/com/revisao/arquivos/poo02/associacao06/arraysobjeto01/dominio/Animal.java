package com.revisao.arquivos.poo02.associacao06.arraysobjeto01.dominio;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
