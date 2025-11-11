package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio3;

public abstract class Pais {
    protected String nome;
    protected String populacao;
    protected double idade;

    public Pais(String nome, String populacao, double idade) {
        this.nome = nome;
        this.populacao = populacao;
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("População: " + this.populacao);
        System.out.println("Idade: " + this.idade);
        System.out.println("-----");
    }
}
