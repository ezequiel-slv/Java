package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void imprimir(){
        System.out.println("Nome: " +  this.nome);
        System.out.printf("Salário base: %.3f\n", salarioBase);
        System.out.printf("Salário com bonus: %.3f\n", calcularBonus());
        System.out.println("-----");
    }

    public abstract double calcularBonus();

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
