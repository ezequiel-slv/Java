package com.estudo.arquivos.poo03.revisao.enumeracao10.dominio;

public enum StatusCompra {
    NOVO("Pedido recebido"),
    PROCESSANDO("Preparando pedido"),
    ENVIADO("Enviando pedido"),
    ENTREGUE("Pedido entregue");

    private String descricao;
    StatusCompra(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


