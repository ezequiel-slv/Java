package com.estudo.arquivos.poo.revisao.classesabstratas11.dominio;

public abstract class Pessoa {
    protected static String loja = "InfoLink";

    static {
        System.out.println(loja);
    }
    public abstract void imprime();
}
