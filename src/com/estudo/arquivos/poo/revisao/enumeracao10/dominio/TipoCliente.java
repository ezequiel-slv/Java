package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Física", 1),
    PESSOA_JURIDICA("Pessoa Jurídica", 2);

    private final String tipoClienteFormat;
    private final int VALOR;

    TipoCliente(String tipoClienteFormat, int VALOR) {
        this.tipoClienteFormat = tipoClienteFormat;
        this.VALOR = VALOR;
    }

    public String getTipoClienteFormat() {
        return tipoClienteFormat;
    }

    public int getVALOR() {
        return VALOR;
    }
}
