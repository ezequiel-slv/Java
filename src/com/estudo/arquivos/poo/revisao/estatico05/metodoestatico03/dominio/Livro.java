package com.estudo.arquivos.poo.revisao.estatico05.metodoestatico03.dominio;

public class Livro {
    private String nome;
    private String autor;
    private int qtdPag;

    private static String nomeBiblioteca;
    private static String tipo;

    private static int codigo;

    static {
        System.out.println("-----Biblioteca-----");
    }

    static {
        codigo = (int) (Math.random() * 5)+1;
        System.out.println("Código do livro: " + codigo);
    }

    public void imprimir(){
        System.out.println("Livro: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Quantidade de páginas: " + this.qtdPag);
        System.out.println("Biblioteca: " + Livro.nomeBiblioteca);
        System.out.println("Gênero: " + Livro.tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public static String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public static void setNomeBiblioteca(String nomeBiblioteca) {
        Livro.nomeBiblioteca = nomeBiblioteca;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Livro.tipo = tipo;
    }
}
