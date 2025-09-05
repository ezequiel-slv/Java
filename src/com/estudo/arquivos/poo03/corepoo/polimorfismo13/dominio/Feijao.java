package com.estudo.arquivos.poo03.corepoo.polimorfismo13.dominio;

public class Feijao extends Produto implements Taxavel{
    public static  final double IMPOSTO_POR_CENTO = 0.05;
    private String dataValidade;

    public Feijao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
