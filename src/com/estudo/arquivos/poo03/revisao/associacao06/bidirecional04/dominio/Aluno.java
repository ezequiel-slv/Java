package com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio;

public class Aluno {
    private String nome;
    private Escola [] escolas;

    public Aluno(String nome, Escola[] escolas) {
        this.nome = nome;
        this.escolas = escolas;
    }

    public void imprimir(){
        System.out.println("Aluno(a): " + this.nome);
        if (escolas != null){
            for (Escola escola : escolas) {
                System.out.println("Sala: " + escola.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
