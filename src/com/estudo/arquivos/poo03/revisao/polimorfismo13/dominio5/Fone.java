package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio5;

public class Fone extends Produto{
    private final double taxa = 0.4;

    public Fone(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.valor * taxa;
    }
}
