package com.estudo.arquivos.poo.polimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
