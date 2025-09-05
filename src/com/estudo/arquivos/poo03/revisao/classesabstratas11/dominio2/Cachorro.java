package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio2;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Animal: " + this.nome);
        System.out.println("Au au");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
