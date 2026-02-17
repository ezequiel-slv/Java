package com.estudo.arquivos.poo02.polimorfismo13.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados...");
    }
}
