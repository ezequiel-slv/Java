package com.estudo.arquivos.poo.construtores.dominio;

public class Estado {
    private String nome;
    private String capital;
    private int idade;
    private int qtmunicipio;
    private int ddd;

    public Estado(String nome, String capital, int idade, int qtmunicipio){
        this();
        this.nome = nome;
        this.capital = capital;
        this.idade = idade;
        this.qtmunicipio = qtmunicipio;
    }

    public Estado(String nome, String capital, int idade, int qtmunicipio, int ddd){
        this(nome, capital, idade, qtmunicipio);
        this.ddd = ddd;

    }
    public Estado(){
        System.out.println("Construtor sem argumento");
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Capital: " + this.capital);
        System.out.println("Idade: " + this.idade);
        System.out.println("Quantidade de municípios: " + this.qtmunicipio);
        System.out.println("DDD: " + this.ddd);

    }
}
