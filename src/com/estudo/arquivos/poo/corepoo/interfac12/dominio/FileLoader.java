package com.estudo.arquivos.poo.corepoo.interfac12.dominio;

public class FileLoader implements DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando arquivo...");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
        System.out.println("Checando permissão");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivos...");
    }
}
