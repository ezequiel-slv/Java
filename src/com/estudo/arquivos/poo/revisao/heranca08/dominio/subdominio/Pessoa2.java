package com.estudo.arquivos.poo.revisao.heranca08.dominio.subdominio;

public class Pessoa2 {
    private final String nome;
    private final int idade;

    private final char sexo;

    private final String cpf;

    public Pessoa2(String nome, int idade, char sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("CPF: "+ this.cpf);
    }
}
