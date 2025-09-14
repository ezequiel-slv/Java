package com.estudo.arquivos.poo03.revisao.associacao06.umparaum00.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Jogador: " + this.nome);
        System.out.println("Time: " + time.getTime());
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }
}
