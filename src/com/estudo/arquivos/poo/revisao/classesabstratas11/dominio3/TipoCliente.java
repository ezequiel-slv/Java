package com.estudo.arquivos.poo.revisao.classesabstratas11.dominio3;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa fisica"),
    PESSOA_JURIDICA("Pessoa jurídica");

    private String tipoClienteFormat;

    TipoCliente(String tipoClienteFormat) {
        this.tipoClienteFormat = tipoClienteFormat;
    }

    @Override
    public String toString() {
        return tipoClienteFormat;
    }

    public String getTipoClienteFormat() {
        return tipoClienteFormat;
    }

    public void setTipoClienteFormat(String tipoClienteFormat) {
        this.tipoClienteFormat = tipoClienteFormat;
    }
}
