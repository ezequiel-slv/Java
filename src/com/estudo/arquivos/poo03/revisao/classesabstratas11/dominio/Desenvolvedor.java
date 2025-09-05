package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + "Nome: " + nome + " | " + "Salário: " + salario;
    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.1;
    }
}
