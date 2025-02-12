package com.estudo.arquivos.revisao.revisaopoo.metodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;


    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        if(idade <= 0){
            System.out.println("Idade inválida");
        }
        return this.idade;
    }
}




