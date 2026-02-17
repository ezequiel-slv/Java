package com.estudo.arquivos.classesutilitarias04.parte2.instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantClass {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println("---------");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

    }
}
