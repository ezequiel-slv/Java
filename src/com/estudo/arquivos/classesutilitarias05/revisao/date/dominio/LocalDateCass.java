package com.estudo.arquivos.classesutilitarias05.revisao.date.dominio;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateCass {
    public void localDate(){
        LocalDate date = LocalDate.of(2025, Month.SEPTEMBER, 2);
        System.out.println(date);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate dataParse = LocalDate.parse("2002-06-10");
        System.out.println(dataParse);
    }

    public void localDate2() {
        File file = new File("folder//file.txt");

        try {
            LocalDate localDate = LocalDate.now();
            boolean fileCrated = file.createNewFile();
            //boolean delete = file.delete();

            if (fileCrated){
                System.out.println("Arquivo criado!");
                System.out.println("Data de criação: " + localDate);
            }else {
                System.out.println("Arquivo já existente!");
            }
            //System.out.println("Arquivo deletado: " + delete);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
