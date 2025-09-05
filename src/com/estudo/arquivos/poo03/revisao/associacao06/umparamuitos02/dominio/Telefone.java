package com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.dominio;

public class Telefone {
    private final String numero;
    private final String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    public String getnumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void imprimir(){
        System.out.println("Número: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
    }
}
