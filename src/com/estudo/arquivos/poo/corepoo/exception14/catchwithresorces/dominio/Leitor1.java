package com.estudo.arquivos.poo.corepoo.exception14.catchwithresorces.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Texto 1 lido com sucesso!");
    }
}
