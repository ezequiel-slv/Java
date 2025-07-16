package com.estudo.arquivos.poo.revisao.estatico05.blocodeinicializacao01.dominio;

public class BlocoDeInicializacao02 {
    private final String nome;
    private final int idade;

    {
        System.out.println("Cadastrando uma nova pessoa...");
        System.out.println("Concluido");
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
    public BlocoDeInicializacao02(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
