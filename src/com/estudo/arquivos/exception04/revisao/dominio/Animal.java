package com.estudo.arquivos.exception04.revisao.dominio;

public abstract class Animal {
    protected String som;

    public Animal(String som) {
        this.som = som;
    }

    public String getSom() {
        return som;
    }
}
