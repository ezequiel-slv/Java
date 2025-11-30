package com.estudo.arquivos.poo03.revisao.classesutilitarias15.parte2;

import java.time.Duration;
import java.time.Instant;

public class DurationClass {
    public static void main(String[] args) {
        Instant inicio = Instant.now();
        Instant fim = Instant.now();

        Duration diferenca = Duration.between(inicio, fim);
        System.out.println(diferenca.toMillis() + "ms");

        System.out.println("----");

        Duration min = Duration.ofMinutes(60);
        System.out.println(min);
        long toHour = min.toHours();
        System.out.println(toHour);
        long toSec = min.toSeconds();
        System.out.println(toSec);

        System.out.println("----");

        Duration min2 = Duration.ofMinutes(30);
        Duration min3 = min2.plusMinutes(10);
        System.out.println(min3);
        long toHour2 = min3.toHours();
        System.out.println(toHour2);
        long toSec2 = min3.toSeconds();
        System.out.println(toSec2);
    }
}
