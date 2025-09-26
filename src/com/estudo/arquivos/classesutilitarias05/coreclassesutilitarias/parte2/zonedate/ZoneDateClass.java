package com.estudo.arquivos.classesutilitarias05.coreclassesutilitarias.parte2.zonedate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneDateClass {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println("--------");

        ZoneId systemedDefault = ZoneId.systemDefault();
        System.out.println(systemedDefault);

        System.out.println("--------");

        ZoneId id = ZoneId.of("Asia/Tokyo");
        System.out.println(id);

        System.out.println("--------");

        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow);

        System.out.println("--------");

        ZonedDateTime atZone = ldtNow.atZone(id);
        System.out.println(atZone);
    }
}
