package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Turma {
    private String nome;
    private Aluno[] alunos;

    public Turma(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
}
