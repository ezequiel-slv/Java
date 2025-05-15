package com.estudo.arquivos.poo.polimorfismo.dominio;

public class Celular extends Produto implements Taxavel{
    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
