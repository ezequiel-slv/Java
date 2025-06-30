package com.estudo.arquivos.poo.src.interfac12.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){}
}
