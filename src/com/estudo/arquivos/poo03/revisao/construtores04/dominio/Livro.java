package com.estudo.arquivos.poo03.revisao.construtores04.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor){
        this(titulo);
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int ano){
        this(titulo, autor);
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("ano: " + ano);
    }
}
