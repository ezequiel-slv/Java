package com.estudo.arquivos.poo02.associacao06.muitosparaum.dominio;

public class Escola {
    private String nome;
    private final Professor [] professores;

    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Nome da escola: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
