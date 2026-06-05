package com.revisao.arquivos.poo02.estatico05.atributoestatico04.dominio;

public class Filme {
    private String nome;
    private String duracao;
    protected static String classificacao;

    public Filme(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void imprimme(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Duracao: " + this.duracao);
        System.out.println("Classificação: " + classificacao);
    }

    public static String getClassificacao() {
        return classificacao;
    }

    public static void setClassificacao(String classificacao) {
        Filme.classificacao = classificacao;
    }
}
