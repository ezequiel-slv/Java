package com.estudo.arquivos.poo03.revisao.polimorfismo13.repositorio;

public class SalvarMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações em memória...");
    }
}
