package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio;

public class Livro {
    private String autor;
    private String titulo;


    public void imprimeLivros(){
        System.out.println("----Biblioteca----");
        System.out.println("Autor: " + autor);
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("------------------");
    }
    public Livro(String autor, String titulo){
      this.autor = autor;
      this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
}
