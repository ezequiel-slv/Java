package com.estudo.arquivos.poo02.construtores04.dominio;

public class Estado {
    private String nome;
    private String capital;
    private int idade;
    private int qtmunicipio;
    private int ddd;
    private double pib;

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

    public Estado(String nome, String capital, int idade, int qtmunicipio, int ddd, int pib){
        this(nome, capital, idade, qtmunicipio, ddd);
        this.pib = pib;
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
        System.out.println("pib: " + this.pib);

    }
}
