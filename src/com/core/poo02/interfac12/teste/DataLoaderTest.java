package com.core.poo02.interfac12.teste;

import com.core.poo02.interfac12.dominio.DataBaseLoader;
import com.core.poo02.interfac12.dominio.FileLoader;

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
