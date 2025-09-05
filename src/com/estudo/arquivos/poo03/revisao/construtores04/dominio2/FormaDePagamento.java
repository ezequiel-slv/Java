package com.estudo.arquivos.poo03.revisao.construtores04.dominio2;

public enum FormaDePagamento {
    CREDITO("Crédito", 1),
    DEBITO("Débito", 2);

    private final String formatPagamento;
    private final int numPagamento;

    FormaDePagamento(String formatPagamento, int numPagamento) {
        this.formatPagamento = formatPagamento;
        this.numPagamento = numPagamento;
    }

    @Override
    public String toString() {
        return "Forma de pagamento: " + formatPagamento + " | " + numPagamento;
    }
}
