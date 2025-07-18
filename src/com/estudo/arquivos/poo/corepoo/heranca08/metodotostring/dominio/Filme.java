package com.estudo.arquivos.poo.corepoo.heranca08.metodotostring.dominio;

public class Filme {
    private String nome;

    @Override
    public String toString() {
        return "Filme: " + this.nome;
    }

    public Filme(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
