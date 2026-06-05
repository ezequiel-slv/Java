package com.revisao.arquivos.poo02.construtores04.dominio;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public void imprimir(){
        if (nome == null){
            System.out.println("Produto desconhecido");
        }else{
            System.out.println("Nome do produto: " + nome);
        }
        if (preco == null){
            System.out.println("0");
        }else{
            System.out.println("Preço do produto: " + preco);
        }
        if (quantidade == null){
            System.out.println("0");
        }else{
            System.out.println("Quantidade do produto: " + quantidade);
        }

    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {

    }


}
