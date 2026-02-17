package com.estudo.arquivos.poo02.classesabstratas11.dominio;

public class Hacker extends Funcionario {
    private final String tipo;

    public Hacker(String nome, String linguagem, String tipo, double salario) {
        super(nome, linguagem, salario);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Hacker: " + nome + " | " + "Linguagem: " + linguagem + " | "  + "Tipo: "+ tipo + " | " + "Salario: " + salario;
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.2;
    }
}
