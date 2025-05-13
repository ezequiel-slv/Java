package com.estudo.arquivos.poo.interfac.teste;

import com.estudo.arquivos.poo.interfac.dominio.DataBaseLoader;
import com.estudo.arquivos.poo.interfac.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.checkPermission();
        dataBaseLoader.remove();

        System.out.println("--------");

        fileLoader.load();
        fileLoader.checkPermission();
        fileLoader.remove();
    }
}
