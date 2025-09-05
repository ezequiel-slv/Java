package com.estudo.arquivos.poo03.revisao.polimorfismo13.repositorio2;
public class SalvarMemoria implements Repositorio2 {
    @Override
    public void salvar() {
        System.out.println("Salvando informações em memória...");
    }
}
