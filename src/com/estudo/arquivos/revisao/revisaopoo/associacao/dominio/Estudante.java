package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (seminario != null){
            System.out.println(seminario.getNome());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

}
