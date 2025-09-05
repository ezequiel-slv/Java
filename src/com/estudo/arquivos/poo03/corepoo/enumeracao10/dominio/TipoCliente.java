package com.estudo.arquivos.poo03.corepoo.enumeracao10.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    private final int valor;
    private final String tipo;


    TipoCliente(int valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public static TipoCliente tipoClienteTemTipo(String tipo){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getTipo().equals(tipo)){
                return tipoCliente;
            }
        }return null;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
