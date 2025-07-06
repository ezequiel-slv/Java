package com.estudo.arquivos.poo.corepoo.polimorfismo13.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados...");
    }
}
