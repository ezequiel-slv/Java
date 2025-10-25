package com.estudo.arquivos.poo03.revisao.enumeracao10.dominio;

public class Compra {
    private final String nome;
    private final double preco;
    private final StatusCompra statusCompra;

    public Compra(String nome, double preco, StatusCompra statusCompra) {
        this.nome = nome;
        this.preco = preco;
        this.statusCompra = statusCompra;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: %.3f\n", this.preco);
        System.out.println("Status: " + statusCompra.getDescricao());
    }
}
