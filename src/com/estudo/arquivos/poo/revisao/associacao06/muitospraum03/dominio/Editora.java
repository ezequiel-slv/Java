package com.estudo.arquivos.poo.revisao.associacao06.muitospraum03.dominio;



public class Editora {
    private String nome;
    private Livro[] livro;

    public Editora(String nome, Livro[] livro) {
        this.nome = nome;
        this.livro = livro;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if (livro != null){
            for (Livro livros : livro) {
                System.out.println("Autor: " + livros.getAutor() + " | " + "Titulo: " + livros.getTitulo());
            }
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivro() {
        return livro;
    }

    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }
}
