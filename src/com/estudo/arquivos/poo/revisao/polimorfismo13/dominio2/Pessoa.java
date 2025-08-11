package com.estudo.arquivos.poo.revisao.polimorfismo13.dominio2;

import java.util.Scanner;

public abstract class Pessoa implements AnotarNumeros{
    private static final Scanner entrada = new Scanner(System.in);
    protected String nome;
    protected int idade;
    protected String cpf;

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCpf());
    }
    public void addInformacoes() {
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        setNome(nome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        setIdade(idade);

        entrada.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = entrada.nextLine();
        setCpf(cpf);
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
