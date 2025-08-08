package com.estudo.arquivos.poo.revisao.polimorfismo13.dominio;

public class Margarina extends Produto {
    private final double IMPOSTO_MARGARINA = 0.03;
    protected String dataValidade;
    public Margarina(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO_MARGARINA;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
