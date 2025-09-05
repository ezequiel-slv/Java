package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio;

public class Celular extends Produto implements CalcularImposto{
    private final double IMPOSTO_CELULAR = 0.05;
    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO_CELULAR;
    }
}
