package com.estudo.arquivos.poo03.revisao.estatico05.modificadorestatico02.dominio;

public class Produto {
    private String nome;

    private double preco;
    private static String tipo;

    static {
        System.out.println("---Mercado---");
    }

    public void imprime(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tipo: " + Produto.tipo);
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Produto.tipo = tipo;
    }
}
