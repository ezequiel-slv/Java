package com.estudo.arquivos.poo.interfac.dominio;

public class DataBaseLoader implements DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
        System.out.println("Checando permissão");
    }

    @Override
    public void remove() {
        System.out.println("Removendo banco de dados...");
    }
}
