package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularBonus();

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
