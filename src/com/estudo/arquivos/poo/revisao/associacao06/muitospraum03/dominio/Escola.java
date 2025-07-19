package com.estudo.arquivos.poo.revisao.associacao06.muitospraum03.dominio;

public class Escola {
    private String nome;
    private final Professor[] professors;

    public void imprimir(){
        System.out.println("Escola: " + this.nome);
        if (professors == null) return;
        for (Professor professor : professors) {
            System.out.println("Professor: " + professor.getNome());
        }

    }
    public Escola(String nome, Professor[] professors) {
        this.nome = nome;
        this.professors = professors;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
