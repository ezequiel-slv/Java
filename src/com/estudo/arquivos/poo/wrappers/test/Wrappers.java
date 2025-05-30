package com.estudo.arquivos.poo.wrappers.test;

public class Wrappers {
    public static void main(String[] args) {

        Byte byteMaiuscula = 1;
        Short shortMaiuscula = 10;
        Integer intMaiuscula = 100;
        Long longMaiuscula = 22222L;
        Float floatMaiuscula = 20f;
        Double doubleMaiuscula = 30d;
        Character charMaiuscula = 'E';
        Boolean booleanMaiuscula = true;

        //1
        int i = intMaiuscula;
        System.out.println(i);
        //2
        Integer integer = Integer.parseInt("4");
        System.out.println(integer);
        //3
        System.out.println(Character.isDigit('5'));
        //4
        System.out.println(Character.isLetterOrDigit('7'));
        //5
        System.out.println(Character.isUpperCase('E'));
        //6
        System.out.println(Character.isLowerCase('e'));


    }
}
