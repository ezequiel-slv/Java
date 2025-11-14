package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio;

public class Garrafa extends Produto{
    private final double taxa = 0.2;

    public Garrafa(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.valor * taxa;
    }
}
