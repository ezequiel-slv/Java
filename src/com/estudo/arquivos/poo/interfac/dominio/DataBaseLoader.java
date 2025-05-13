package com.estudo.arquivos.poo.interfac.dominio;

public class DataBaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }
}
