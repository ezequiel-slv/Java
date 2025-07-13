package com.estudo.arquivos.poo.revisao.construtores04.dominio;

public class Aluno {
    private final String nome;
    private final int idade;
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, String matricula, String curso){
        this(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.matricula);
        System.out.println(this.curso);
    }
}
