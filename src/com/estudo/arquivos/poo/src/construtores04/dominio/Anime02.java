package com.estudo.arquivos.poo.src.construtores04.dominio;
//Sobrecarga de construtores
public class Anime02 {
    private  String nome;
    private  int episodeos;
    private  String tipo;
    private  String genero;
    private String estudio;

    public Anime02(String nome, int episodeos, String tipo, String genero) {
        this();
        this.nome = nome;
        this.episodeos = episodeos;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Anime02(String nome, int episodeos, String tipo, String genero, String estudio){
        this(nome, episodeos, tipo, genero);
        this.estudio = estudio;
    }
    public Anime02(){
        System.out.println("Construtor sem argumento");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.episodeos);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
}
