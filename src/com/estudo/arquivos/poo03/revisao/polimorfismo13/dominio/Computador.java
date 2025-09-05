package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio;

public class Computador extends Produto implements CalcularImposto{
    private final double IMPOSTO_COMPUTADOR = 0.10;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO_COMPUTADOR;
    }
}
