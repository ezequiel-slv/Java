package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio;

public class Tomate extends Produto{
    private final double taxa = 0.1;
    private String dataValidade;

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calculaImposto() {
        return this.valor * taxa;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
