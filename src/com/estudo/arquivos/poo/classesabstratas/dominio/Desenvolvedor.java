package com.estudo.arquivos.poo.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, String linguagem, double salario) {
        super(nome, linguagem, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " | " + "Linguagem: " + linguagem + " | " + "Salario: " + salario;
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.1;
    }
}
