package com.estudo.arquivos.poo03.revisao.exception14.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Arquivo01 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Arquivo fechado!");
    }
}
