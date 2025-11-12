package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4;

public class Gerente extends Funcionario{
    private final double bonus = 0.20;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() + getSalarioBase() * this.bonus;
    }
}
