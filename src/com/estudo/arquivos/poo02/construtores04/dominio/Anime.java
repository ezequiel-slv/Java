package com.estudo.arquivos.poo02.construtores04.dominio;
//Construtores
public class Anime {
    private  String nome;
    private  int episodeos;
    private  String tipo;
    private  String genero;

    public Anime(String nome, int episodeos, String tipo, String genero) {
        System.out.println("Construtor com atribuição");
        this.nome = nome;
        this.episodeos = episodeos;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Anime(){

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.episodeos);
        System.out.println(this.tipo);
        System.out.println(this.genero);
    }
}

