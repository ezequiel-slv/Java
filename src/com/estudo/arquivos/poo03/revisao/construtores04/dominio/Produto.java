package com.estudo.arquivos.poo03.revisao.construtores04.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public void imprime(){
        System.out.println("Nome: " + (nome == null ? "Nome não informado" : this.nome));
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Categoria: " + (categoria == null ? "Categoria não informada" : this.categoria));
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidade, String categoria){
        this(nome, preco);
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

}
