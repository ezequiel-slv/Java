package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Aluno {
    private String nome;
    private Turma turma;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (turma != null){
            System.out.println(turma.getNome());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTurma(Turma turma){
        this.turma = turma;
    }
}
