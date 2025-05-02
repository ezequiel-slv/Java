package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome){
        this.nome = nome;
    }

    public Estudante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Estudante(String nome, int idade, Seminario seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public Seminario getSeminario(){
        return seminario;
    }
}
