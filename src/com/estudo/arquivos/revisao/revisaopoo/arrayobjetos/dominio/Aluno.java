package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio;

public class Aluno {
    private final String nome;
    private final int nota;

    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("nota: " + nota);
    }

    public void avaliar(){
        if (nota >= 7){
            System.out.println("Aluno(a) aprovado");
        }else{
            System.out.println("Aluno(b) Reprovado");
        }
    }
}
