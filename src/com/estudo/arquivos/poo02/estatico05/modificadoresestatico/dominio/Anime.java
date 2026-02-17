package com.estudo.arquivos.poo02.estatico05.modificadoresestatico.dominio;

public class Anime {
    private final String nome;
    private final int episodeos;
    public static String tipo;

    public Anime(String nome, int episodeos){
        this.nome = nome;
        this.episodeos = episodeos;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Anime: " + this.nome);
        System.out.println("Episodeos: " + this.episodeos);
        System.out.println("Tipo: " + tipo);
    }
}
