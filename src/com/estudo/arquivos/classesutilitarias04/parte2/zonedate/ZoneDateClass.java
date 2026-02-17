package com.estudo.arquivos.classesutilitarias04.parte2.zonedate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;

public class ZoneDateClass {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println("--------");

        ZoneId systemedDefault = ZoneId.systemDefault();
        System.out.println(systemedDefault);

        System.out.println("--------");

        ZoneId jp = ZoneId.of("Asia/Tokyo");
        System.out.println(jp);

        System.out.println("--------");

        ZonedDateTime br = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(br);

        System.out.println("--------");

        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow);

        System.out.println("--------");

        ZonedDateTime atZone = ldtNow.atZone(jp);
        System.out.println(atZone);

        System.out.println("--------");

        Set<String> avaliable = ZoneId.getAvailableZoneIds();
        System.out.println(avaliable);
    }
}
