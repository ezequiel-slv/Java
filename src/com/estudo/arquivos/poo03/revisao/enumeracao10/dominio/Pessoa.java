package com.estudo.arquivos.poo03.revisao.enumeracao10.dominio;

public class Pessoa {
    private final String nome;
    private final int idade;
    private final String cpf;
    private final char sexo;

    public Pessoa(String nome, int idade, String cpf, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }
}
