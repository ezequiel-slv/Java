package com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.valor);
        System.out.printf("Imposto a ser pago: %.2f\n", calculaImposto());
    }
}
