package com.estudo.arquivos.poo03.revisao.modificadorfinal09.dominio;

public class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome;
    }

    public void imprime(){
        System.out.println("Funcionario: " + nome);
    }
}
