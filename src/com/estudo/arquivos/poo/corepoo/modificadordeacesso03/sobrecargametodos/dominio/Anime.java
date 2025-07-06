package com.estudo.arquivos.poo.corepoo.modificadordeacesso03.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private int episodeos;
    private String tipo;
    private String genero;

    public void init(String nome, int episodeos, String tipo){
        this.nome = nome;
        this.episodeos = episodeos;
        this.tipo = tipo;
        this.genero = genero;
    }

    public void init(String nome, int episodeos, String tipo, String genero){
        this.init(nome, episodeos, tipo);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.episodeos);
        System.out.println(this.tipo);
        System.out.println(this.genero);
    }

}
