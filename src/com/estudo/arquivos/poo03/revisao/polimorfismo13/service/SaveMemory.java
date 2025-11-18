package com.estudo.arquivos.poo03.revisao.polimorfismo13.service;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.repositorio.Repositorio;

public class SaveMemory implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em moemória...");
    }
}
