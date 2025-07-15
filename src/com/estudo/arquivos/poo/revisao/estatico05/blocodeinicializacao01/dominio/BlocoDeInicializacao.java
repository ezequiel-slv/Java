package com.estudo.arquivos.poo.revisao.estatico05.blocodeinicializacao01.dominio;

public class BlocoDeInicializacao {
    private final String nome;
    private final int idade;

    {
        System.out.println("---Informações pessoais---");
    }

    public BlocoDeInicializacao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
