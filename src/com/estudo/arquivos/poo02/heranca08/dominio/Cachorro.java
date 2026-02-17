package com.estudo.arquivos.poo02.heranca08.dominio;

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
