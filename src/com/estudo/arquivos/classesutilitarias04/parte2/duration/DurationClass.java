package com.estudo.arquivos.classesutilitarias04.parte2.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationClass {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afterYear = LocalDateTime.now().plusYears(2);
        Duration between1 = Duration.between(now, afterYear);
        System.out.println(between1);

        System.out.println("-------------");

        LocalTime timeNow = LocalTime.now();
        LocalTime afterTime = LocalTime.now().plusHours(7).plusMinutes(30);
        Duration between2 = Duration.between(timeNow, afterTime);
        System.out.println(between2);
    }
}
