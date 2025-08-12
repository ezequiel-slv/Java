package com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio2;

public class SalvarArquivo implements Repositorio2 {
    @Override
    public void salvar() {
        System.out.println("Salvando informações no arquivo...");
    }
}
