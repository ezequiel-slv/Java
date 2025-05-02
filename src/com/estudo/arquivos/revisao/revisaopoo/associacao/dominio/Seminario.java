package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, Estudante[] estudantes){
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public Seminario(String titulo, Estudante[] estudantes, Local local){
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setEstudantes(Estudante[] estudantes){
        this.estudantes = estudantes;
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public Local getLocal(){
        return local;
    }
}
