package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio;

public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimirDados(){
        System.out.println("Nome do produto: " + nome);
        System.out.printf("Preço do produto: %.2fR$\n", preco);
    }

    public void desconto(){
         double des = preco - (preco * 0.10);
        System.out.println("Valor com desconto: " + des);
    }

}
