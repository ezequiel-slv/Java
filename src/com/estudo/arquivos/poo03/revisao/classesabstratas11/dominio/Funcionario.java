package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {

    }

    public abstract  void calcularBonus();
}
