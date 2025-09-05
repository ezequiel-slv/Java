package com.estudo.arquivos.classesutilitarias05.revisao.time;

import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(21, 30, 1);
        System.out.println(time);

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
    }
}
