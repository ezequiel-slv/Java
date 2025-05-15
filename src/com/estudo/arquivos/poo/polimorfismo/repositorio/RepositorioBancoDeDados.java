package com.estudo.arquivos.poo.polimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados...");
    }
}
