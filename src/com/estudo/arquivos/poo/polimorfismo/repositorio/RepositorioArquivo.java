package com.estudo.arquivos.poo.polimorfismo.repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo...");
    }
}
