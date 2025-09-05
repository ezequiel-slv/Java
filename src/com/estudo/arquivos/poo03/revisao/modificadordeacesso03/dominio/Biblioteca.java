package com.estudo.arquivos.poo03.revisao.modificadordeacesso03.dominio;

public class Biblioteca {
    private String titulo;
    private String paginas;
    private String autor;
    private String genero;

    public void imprime(){
        System.out.println(this.autor);
        System.out.println(this.titulo);
        System.out.println(this.paginas);
        System.out.println(this.genero);
    }

    public void init(String autor, String titulo, String paginas){
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void init(String autor, String titulo, String paginas, String genero){
        this.init(autor, titulo, paginas);
        this.genero = genero;
    }
}
