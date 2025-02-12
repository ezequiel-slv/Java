package com.estudo.arquivos.poo.introducaometodos.dominio;

public class Pessoa {
    private int idade;
    private String nome;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade <= 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}




