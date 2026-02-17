package com.estudo.arquivos.poo02.associacao06.umparamuitos.dominio;

public class Produto {
    private String nome;
    private final double preco;
    private Categoria categoria;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void imprime(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.printf("Preço: %.2f\n", this.preco);
        if (categoria != null){
            System.out.println("Categoria: " + categoria.getNome());
        }else{
            System.out.println("Categoria não encontrada");
        }
        System.out.println("--------------");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
