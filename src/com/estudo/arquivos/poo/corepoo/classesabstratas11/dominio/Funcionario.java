package com.estudo.arquivos.poo.corepoo.classesabstratas11.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String linguagem;
    protected double salario;

    public Funcionario(String nome, String linguagem, double salario) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();
}
