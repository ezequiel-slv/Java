package com.estudo.arquivos.poo03.corepoo.heranca08.dominio;

public class Cachorro extends Animal{

    protected String raca;

    public Cachorro(String animal, String raca) {
        super(animal);
        this.raca = raca;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Raça: " + this.raca);
    }
}
