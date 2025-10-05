package com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio;

public class Escola {
    private String nome;
    private Aluno [] alunos;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Sala: " + this.nome);
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
