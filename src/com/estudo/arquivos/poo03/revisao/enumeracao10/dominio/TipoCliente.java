package com.estudo.arquivos.poo03.revisao.enumeracao10.dominio;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Física", 1),
    PESSOA_JURIDICA("Pessoa Jurídica", 2);

    private String tipoClienteFormat;
    private final int VALOR;

    TipoCliente(String tipoClienteFormat, int VALOR) {
        this.tipoClienteFormat = tipoClienteFormat;
        this.VALOR = VALOR;
    }

    public static TipoCliente clientePorRelatorio(String tipoClienteFormat){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getTipoClienteFormat().equals(tipoClienteFormat)){
                return tipoCliente;
            }
        }return null;
    }
    public String getTipoClienteFormat() {
        return tipoClienteFormat;
    }

    public int getVALOR() {
        return VALOR;
    }
}
