package com.estudo.arquivos.revisao.revisaopoo.construtores.dominio;

public class Carro {
    private String nome;
    private String marca;
    private int ano;

    public Carro(String nome, String marca, int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
