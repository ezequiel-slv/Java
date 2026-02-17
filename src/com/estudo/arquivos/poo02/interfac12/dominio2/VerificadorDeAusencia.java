package com.estudo.arquivos.poo02.interfac12.dominio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface VerificadorDeAusencia {
    void validarPresenca();

    static void datasessao(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
