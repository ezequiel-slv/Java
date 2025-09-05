package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio2;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Animal: " + this.nome);
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
