package com.revisao.arquivos.poo02.estatico05.metodoestatico03.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private static String cpf;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
    }

    public static void setCpf(String cpf) {
        Pessoa.cpf = cpf;
    }
}
