package com.core.classesutilitarias04.parte2.regex;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        split();
        delimiter();
        delimiterType();
    }

    public static void split(){
        String texto = "Eren, Mikasa, Levi";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

        System.out.println("------");
    }

    public static void delimiter(){
        String texto = "Eren, Mikasa, Levi";
        Scanner scanner = new Scanner(texto);

        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            System.out.println(scanner.next().trim());
        }

        System.out.println("------");
    }

    public static void delimiterType(){
        String texto = "Eren, Mikasa, Levi, 200, true";
        Scanner scanner = new Scanner(texto);

        scanner.useDelimiter(",");

        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.hasNextBoolean();
                System.out.println("Boolean: " + b);
            }else {
                System.out.println(scanner.next().trim());
            }
        }

        System.out.println("------");
    }
}
