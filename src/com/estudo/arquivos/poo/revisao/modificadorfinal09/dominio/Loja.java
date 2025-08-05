package com.estudo.arquivos.poo.revisao.modificadorfinal09.dominio;

public class Loja {
    private final static  String NOME = "Alfa Games";
    public final Jogo JOGO = new Jogo();

    static {
        System.out.println("Loja: " + NOME);
    }
}
