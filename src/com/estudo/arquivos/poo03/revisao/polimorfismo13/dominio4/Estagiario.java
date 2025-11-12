package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase;
    }
}
