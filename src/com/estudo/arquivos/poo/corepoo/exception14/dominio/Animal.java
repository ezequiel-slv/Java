package com.estudo.arquivos.poo.corepoo.exception14.dominio;

public abstract class Animal {
    protected String som;

    public Animal(String som) {
        this.som = som;
    }

    public String getSom() {
        return som;
    }
}
