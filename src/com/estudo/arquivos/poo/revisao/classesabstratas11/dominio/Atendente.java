package com.estudo.arquivos.poo.revisao.classesabstratas11.dominio;

public class Atendente extends Funcionario{

    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Atendente: " + "Nome: " + nome + " | " + "Salário: " + salario;
    }

    @Override
    public void calcularBonus() {
        this.salario =  salario + salario * 0.5;
    }
}
