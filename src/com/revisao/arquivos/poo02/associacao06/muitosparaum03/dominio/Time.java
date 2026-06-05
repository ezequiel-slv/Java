package com.revisao.arquivos.poo02.associacao06.muitosparaum03.dominio;

public class Time {
    private String nome;
    private Jogador jogador;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(jogador.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
