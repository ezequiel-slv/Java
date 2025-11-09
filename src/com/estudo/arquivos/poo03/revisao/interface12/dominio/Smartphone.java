package com.estudo.arquivos.poo03.revisao.interface12.dominio;

public class Smartphone implements Conectavel, Recarregavel{
    @Override
    public void conectar() {
        System.out.println("Smartphone conectando-se a internet...");
    }

    @Override
    public void recarregar() {
        System.out.println("Smartphone recarregando...");
    }
}
