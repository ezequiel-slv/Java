package com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio;

public class SalvarArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações no arquivo...");
    }
}
