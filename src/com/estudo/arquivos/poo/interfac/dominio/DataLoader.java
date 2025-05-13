package com.estudo.arquivos.poo.interfac.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){}
}
