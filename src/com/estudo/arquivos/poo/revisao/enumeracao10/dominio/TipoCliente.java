package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Física"),
    PESSOA_JURIDICA("Pessoa Jurídica");

    public final String tipoClienteFormat;

    TipoCliente(String tipoClienteFormat) {
        this.tipoClienteFormat = tipoClienteFormat;
    }
}
