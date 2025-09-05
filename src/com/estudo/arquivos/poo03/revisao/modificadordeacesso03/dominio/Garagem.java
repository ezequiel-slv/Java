package com.estudo.arquivos.poo03.revisao.modificadordeacesso03.dominio;

public class Garagem {
    private String modelo;
    private int ano;
    private String tipo;
    private String cor;

    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
    }

    public void init(String modelo, int ano, String tipo){
        this.modelo = modelo;
        this.ano  = ano;
        this.tipo = tipo;
    }

    public void init(String modelo, int ano, String tipo, String cor){
        this.init(modelo, ano, tipo);
        this.cor = cor;
    }
}
