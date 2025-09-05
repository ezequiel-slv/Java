package com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println("Time: " + this.nome);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador: " + jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
