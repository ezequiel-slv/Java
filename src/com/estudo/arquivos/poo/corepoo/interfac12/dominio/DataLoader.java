package com.estudo.arquivos.poo.corepoo.interfac12.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){}
}
