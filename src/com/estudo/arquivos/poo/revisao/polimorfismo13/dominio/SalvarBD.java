package com.estudo.arquivos.poo.revisao.polimorfismo13.dominio;

import com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio.Repositorio;

public class SalvarBD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações no banco de dados...");
    }
}
