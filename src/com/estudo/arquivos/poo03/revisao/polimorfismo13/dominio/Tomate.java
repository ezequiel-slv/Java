package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio;

public class Tomate extends Produto{
    private final double taxa = 0.5;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Imposto a ser");
        return this.valor * taxa;
    }
}
