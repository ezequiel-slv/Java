package com.estudo.arquivos.classesutilitarias05.revisao.duration;
import java.time.Duration;

public class DurationClass {
    public static void main(String[] args) {
        Duration hours = Duration.ofHours(7);
        Duration minutes = Duration.ofMinutes(30);
        Duration second = Duration.ofSeconds(1);

        Duration time = hours.plus(minutes).plus(second);
        System.out.println(time);
    }
}
