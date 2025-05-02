package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Seminario {
    private String nome;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (local != null){
            System.out.println(local.getEndereco());
        }
        if (estudantes != null){
            for (Estudante estudante : estudantes) {
                System.out.println(estudante.getNome());
            }

        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public void setEstudantes(Estudante[] estudantes){
        this.estudantes = estudantes;
        for (Estudante estudante : estudantes){
            estudante.setSeminario(this);
        }
    }
}
