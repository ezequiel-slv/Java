package com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio;

public class Professor {
    private String nome;
    private EscolaDeMusica escolaDeMusica;

    public Professor(String nome){
        this.nome= nome;
    }

    public Professor(String nome, EscolaDeMusica escolaDeMusica) {
        this(nome);
        this.escolaDeMusica = escolaDeMusica;
    }

    public void imprimir(){
        System.out.println("Professor: " + this.nome);
        if (escolaDeMusica != null){
            System.out.println("Escola: " + escolaDeMusica.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EscolaDeMusica getEscolaDeMusica() {
        return escolaDeMusica;
    }

    public void setEscolaDeMusica(EscolaDeMusica escolaDeMusica) {
        this.escolaDeMusica = escolaDeMusica;
    }
}
