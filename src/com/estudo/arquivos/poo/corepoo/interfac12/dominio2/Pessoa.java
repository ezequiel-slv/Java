package com.estudo.arquivos.poo.corepoo.interfac12.dominio2;

import java.util.Random;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    protected static int code;

    static {
        Random random = new Random();
        code = random.nextInt(300);
        System.out.println("Código de validação: " + code);
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
