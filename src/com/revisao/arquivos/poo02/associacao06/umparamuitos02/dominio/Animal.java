package com.revisao.arquivos.poo02.associacao06.umparamuitos02.dominio;

public class Animal {
    private String nome;
    private Zoologico zoologico;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(zoologico.getNome());
        System.out.println("-------");
    }

    public void setZoologico(Zoologico zoologico) {
        this.zoologico = zoologico;
    }
}
