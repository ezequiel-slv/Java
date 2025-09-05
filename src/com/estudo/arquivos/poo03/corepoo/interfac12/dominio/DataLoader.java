package com.estudo.arquivos.poo03.corepoo.interfac12.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){}
}
