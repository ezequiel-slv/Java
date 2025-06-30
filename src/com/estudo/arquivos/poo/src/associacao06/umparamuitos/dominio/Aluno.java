package com.estudo.arquivos.poo.src.associacao06.umparamuitos.dominio;

public class Aluno {
    private String nome;
    private Curso curso;

    public Aluno(String nome){
        this.nome = nome;
    }

    public  void imprime(){
        System.out.println(this.nome);
        if (curso != null){
            System.out.println(curso.getNome());
        }else{
            System.out.println("Não matriculado");
        }
        System.out.println("---------");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
