package com.estudo.arquivos.poo.corepoo.modificadorfinal09.dominio;

public class Carro {
    private String carro;
    public static final int VELOCIDADE_LIMITE = 190;
    public final Comprador COMPRADOR = new Comprador();

    public void imprime(){
        System.out.println("Carro: " + this.carro);
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
