package com.estudo.arquivos.classesutilitarias05.revisao.instant;

import java.time.Instant;

public class InstantClass {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Agora: " + now);

        System.out.println("------");

        Instant future = Instant.now().plusSeconds(3600);
        System.out.println("Mais 1h: " + future);

        long diferenca = future.getEpochSecond() - now.getEpochSecond();
        System.out.println("Diferença: " + diferenca);
    }
}
