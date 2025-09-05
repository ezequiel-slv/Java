package com.estudo.arquivos.poo03.revisao.polimorfismo13.repositorio;

public class SalvarArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações no arquivo...");
    }
}
