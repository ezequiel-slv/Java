package com.revisao.arquivos.poo02.associacao06.bidirecional04.dominio;

public class Nave {
    private String nome;
    private Astronauta[]  astronautas;

    public Nave(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nave: " + nome);
        if (astronautas == null) return;
        for (Astronauta a : astronautas) {
                System.out.println("Astronauta: " + a.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Astronauta[] getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(Astronauta[] astronautas) {
        this.astronautas = astronautas;
    }
}
