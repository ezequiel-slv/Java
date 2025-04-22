package com.estudo.arquivos.revisao.revisaopoo.construtores.dominio;

public class Carro02 {
    private final String nome;
    private final String marca;
    private final int ano;

    public Carro02(String nome, String marca, int ano){
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
