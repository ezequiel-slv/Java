package com.estudo.arquivos.poo.classesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String linguagem;

    public Funcionario(String nome, String linguagem) {
        this.nome = nome;
        this.linguagem = linguagem;
    }
}
