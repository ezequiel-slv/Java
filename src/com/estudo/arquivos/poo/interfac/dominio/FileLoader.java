package com.estudo.arquivos.poo.interfac.dominio;

public class FileLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando arquivo...");
    }
}
