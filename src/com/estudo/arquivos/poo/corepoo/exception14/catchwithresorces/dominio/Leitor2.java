package com.estudo.arquivos.poo.corepoo.exception14.catchwithresorces.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Texto 2 lido com sucesso!");
    }
}
