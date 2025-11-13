package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio5;

public class Mochila extends Produto{
    private final double taxa = 0.6;

    public Mochila(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.valor * taxa;
    }
}
