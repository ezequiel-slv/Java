package com.estudo.arquivos.poo03.revisao.heranca08.metodotostring.dominio;

public class Endereco {
    private final String rua;

    private final int numero;

    private final String logradouro;
    private final String cep;

    public Endereco(String rua, int numero, String logradouro, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.logradouro = logradouro;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco: " + rua + " | " + "Numero: " + numero + " | " +"Logradouro: " + logradouro + " | " + "Cep: " + cep;
    }
}
