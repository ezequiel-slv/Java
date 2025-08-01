package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public enum TipoPagamento {
    CREDITO(1),
    DEBITO(2);

    public final int numTipoPagamento;

    TipoPagamento(int numTipoPagamento) {
        this.numTipoPagamento = numTipoPagamento;
    }
}
