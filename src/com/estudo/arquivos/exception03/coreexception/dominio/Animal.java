package com.estudo.arquivos.exception03.coreexception.dominio;

public abstract class Animal {
    protected String som;

    public Animal(String som) {
        this.som = som;
    }

    public String getSom() {
        return som;
    }
}
