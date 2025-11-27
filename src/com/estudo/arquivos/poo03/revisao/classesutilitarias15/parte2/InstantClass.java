package com.estudo.arquivos.poo03.revisao.classesutilitarias15.parte2;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantClass {
    public static void main(String[] args) {
        Instant Inow = Instant.now();
        System.out.println("Instant: " + Inow);

        System.out.println("-----");

        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println("LocalDateTime: " + ldtNow);

        System.out.println("-----");

        System.out.println(Inow.getEpochSecond());
        System.out.println(Inow.getNano());

    }
}
