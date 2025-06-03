package com.estudo.arquivos.poo.classesutilitarias.wrappers.test;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
       // AutoBoxing();
       // Unboxing();
       // ConversaoTipo1();
        //ConversaoTipo2();
        ComparacaoTipo();
    }

    public static void AutoBoxing(){
        System.out.println("AutoBoxing");

        Byte byteClass = 1;
        System.out.println(byteClass);
        Short shortClass = 10;
        System.out.println(shortClass);
        Integer integerClass = 100;
        System.out.println(integerClass);
        Long longClass = 22222L;
        System.out.println(longClass);
        Float floatClass = 20f;
        System.out.println(floatClass);
        Double doubleClass = 30d;
        System.out.println(doubleClass);
        Character characterClass = 'E';
        System.out.println(characterClass);
        Boolean booleanClass = true;
        System.out.println(booleanClass);
    }

    public static void Unboxing(){
        System.out.println("Unboxing");

        Byte byteClass = 1;
        Short shortClass = 10;
        Integer integerClass = 100;
        Long longClass = 22222L;
        Float floatClass = 20f;
        Double doubleClass = 30d;
        Character characterClass = 'E';
        Boolean booleanClass = true;

        byte byteValor = byteClass;
        System.out.println(byteValor);
        short shortValor = shortClass;
        System.out.println(shortValor);
        int intValor = integerClass;
        System.out.println(intValor);
        long longValor = longClass;
        System.out.println(longValor);
        float floatValor = floatClass;
        System.out.println(floatValor);
        double doubleValor = doubleClass;
        System.out.println(doubleValor);
        char charValor = characterClass;
        System.out.println(charValor);
        boolean booleanValor = booleanClass;
        System.out.println(booleanValor);
    }

    public static void ConversaoTipo1(){

        Byte byteClass = Byte.valueOf(Byte.toString((byte) 8));
        System.out.println("Valor: " + byteClass +  " convertido para String ");
        Short shortClass = 10;
        Integer integerClass = 100;
        Long longClass = 22222L;
        Float floatClass = 20f;
        Double doubleClass = 30d;
        Character characterClass = 'E';
        Boolean booleanClass = true;

    }
    public static void ConversaoTipo2(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        String numero = entrada.nextLine();


        Integer integer = Integer.valueOf(numero);
        System.out.println(integer);
        entrada.close();
    }

    public static void ComparacaoTipo(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite mais um número inteiro: ");
        int valor2 = entrada.nextInt();

        Integer integer1 = valor1;
        Integer integer2 = valor2;
        entrada.close();

        if (integer1.equals(integer2)){
            System.out.println("Iguais");
        }
        System.out.println("Diferentes");
    }
}
