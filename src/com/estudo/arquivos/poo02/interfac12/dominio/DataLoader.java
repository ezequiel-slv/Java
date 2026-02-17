package com.estudo.arquivos.poo02.interfac12.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){}
}
