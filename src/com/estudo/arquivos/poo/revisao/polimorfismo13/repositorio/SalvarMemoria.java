package com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio;

public class SalvarMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações em memória...");
    }
}
