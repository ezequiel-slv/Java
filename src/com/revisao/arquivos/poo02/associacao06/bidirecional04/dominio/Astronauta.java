package com.revisao.arquivos.poo02.associacao06.bidirecional04.dominio;

public class Astronauta {
    private String nome;
    private Nave nave;

    public Astronauta(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        if (nave != null) {
            System.out.println("Nave: " + nave.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }
}
