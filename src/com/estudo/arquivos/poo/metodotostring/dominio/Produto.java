package com.estudo.arquivos.poo.metodotostring.dominio;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    @Override
    public String toString() {
        return this.nome + " | " + "preço: R$ " + this.preco + " | " + " Quantidade: " + this.quantidade;
    }

    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
