package com.estudo.arquivos.poo.corepoo.polimorfismo13.repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
