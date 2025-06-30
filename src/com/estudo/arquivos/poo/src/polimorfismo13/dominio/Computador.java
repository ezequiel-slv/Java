package com.estudo.arquivos.poo.src.polimorfismo13.dominio;

public class Computador extends Produto implements Taxavel{
    public static  final double IMPOSTO_POR_CENTO = 0.10;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
