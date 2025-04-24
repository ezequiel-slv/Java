package com.estudo.arquivos.poo.estatico.inicializacaoestatico.dominio;

public class Anime {
    private final String nome;
    private final int episodeos;
    private final static String tipo;

    static{
        System.out.println("Inicializando bloco estático");
        tipo = "Shounem";
    }

    public Anime(String nome, int episodeos){
        this.nome = nome;
        this.episodeos = episodeos;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome do Anime: " + this.nome);
        System.out.println("quantidade de episodeos: " + this.episodeos);
        System.out.println("Tipo do Anime: " + tipo);
    }
}
