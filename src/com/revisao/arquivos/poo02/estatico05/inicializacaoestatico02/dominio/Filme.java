package com.revisao.arquivos.poo02.estatico05.inicializacaoestatico02.dominio;

public class Filme {
    private final String nome;
    private final String duracao;
    private final String classificacao;
    public static String produtora = "Warner Bros";

    static {
        System.out.println("Inicializando Filme");
        System.out.println("Produtora: " + produtora);
    }

    public Filme(String nome, String duracao, String classificacao) {
        this.nome = nome;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Duracao: " + duracao);
        System.out.println("Classificacao: " + classificacao);
    }
}

