package com.estudo.arquivos.poo03.revisao.construtores04.dominio2;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Aguardando pagamento"),
    PROCESSANDO("Processando"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue");

    private final String statusFormat;

    StatusPedido(String statusFormat) {
        this.statusFormat = statusFormat;
    }

    @Override
    public String toString() {
        return statusFormat;
    }
}
