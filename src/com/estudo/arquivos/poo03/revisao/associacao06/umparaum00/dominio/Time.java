package com.estudo.arquivos.poo03.revisao.associacao06.umparaum00.dominio;

public class Time {
    private String time;
    private Jogador jogador;

    public Time(String time) {
        this.time = time;
    }

    public void imprimir(){
        System.out.println("Time: " + this.time);
        System.out.println("Jogador: " + jogador.getNome());
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public String getTime() {
        return time;
    }
}
