package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4;

public class Vendedor extends Funcionario{
    private final double bonus = 0.10;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() + getSalarioBase() * this.bonus;
    }
}
