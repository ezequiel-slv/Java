package com.estudo.arquivos.poo.revisao.modificadorfinal09.dominio;

public class Jogo {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogo: " + nome;
    }

    public void imprimir(){
        System.out.println("Jogo: " + this.nome);
    }
}
