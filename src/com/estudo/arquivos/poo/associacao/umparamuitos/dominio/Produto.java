package com.estudo.arquivos.poo.associacao.umparamuitos.dominio;

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
            System.out.println(categoria.getNome());
        }else{
            System.out.println("Categoria não encontrada");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
