package com.estudo.arquivos.poo.revisao.estatico05.blocoestatico04.dominio;

public class BlocoEstatico {
    private final String produto;
    private final static String codigo;

    static {
           int codigoAleatorio = (int) ((Math.random() * 100) + 1);
           codigo = "COD-P: " + codigoAleatorio;
        System.out.println(codigo);
    }

    public BlocoEstatico(String produto){
        this.produto = produto;
    }

    public void imprime(){
        System.out.println("Produto: " + this.produto);
    }
}
