package com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio;

public class EscolaDeMusica {
    private String nome;
    private Professor[] professores;

    public EscolaDeMusica(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
