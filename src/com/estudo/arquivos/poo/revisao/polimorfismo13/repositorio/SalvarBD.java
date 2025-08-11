package com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio;

public class SalvarBD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações no banco de dados...");
    }
}
