package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public class Empresa {
    private String  nome;

    public Empresa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }
}
