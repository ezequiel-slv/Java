package com.estudo.arquivos.poo03.revisao.introducaometodos02.dominio;

public class Carro {
    private final String nome;
    private final String modelo;
    private double valor;

    public Carro(String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
    }

    public Carro(String nome, String modelo, double valor){
        this(nome, modelo);
        this.valor = valor;
    }

    public void imprimir(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Modelo: " + this.modelo);
    System.out.printf("Valor: %.3f\n", this.valor);
    }

}
