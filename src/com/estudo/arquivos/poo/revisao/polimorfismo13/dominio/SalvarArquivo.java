package com.estudo.arquivos.poo.revisao.polimorfismo13.dominio;

import com.estudo.arquivos.poo.revisao.polimorfismo13.repositorio.Repositorio;

public class SalvarArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando informações no arquivo...");
    }
}
