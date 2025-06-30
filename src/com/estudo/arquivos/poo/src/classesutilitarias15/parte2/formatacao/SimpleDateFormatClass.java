package com.estudo.arquivos.poo.src.classesutilitarias15.parte2.formatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {
    public static void main(String[] args) {
        String pattern = "'Brazil' EEEEEE dd 'at 'MMMM 'at' yyyy k':'m':'s a";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
