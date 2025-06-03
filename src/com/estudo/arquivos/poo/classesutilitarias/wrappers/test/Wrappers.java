package com.estudo.arquivos.poo.classesutilitarias.wrappers.test;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
       AutoBoxing();
       Unboxing();
       ConversaoTipo1();
       ConversaoTipo2();
       ComparacaoTipo();
       OperacoesComWrappers();
       Character();
       Boolean();
       MetodosUtilitarios();
       Nulo();
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
        System.out.println("Conversão tipo");

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
        System.out.println("Conversão tipo 2");
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Digite um número");
        String numero = entrada1.nextLine();


        Integer integer = Integer.valueOf(numero);
        System.out.println(integer);
        entrada1.close();
    }

    public static void ComparacaoTipo(){
        System.out.println("Comparação tipo");

        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int valor1 = entrada2.nextInt();

        System.out.println("Digite mais um número inteiro: ");
        int valor2 = entrada2.nextInt();

        Integer integer1 = valor1;
        Integer integer2 = valor2;
        entrada2.close();

        if (integer1.equals(integer2)){
            System.out.println("Iguais");
        }
        System.out.println("Diferentes");
    }

    public static void OperacoesComWrappers(){
        System.out.println("Operação com wrappers");

        Scanner entrada3 = new Scanner(System.in);

        System.out.println("Digite um número");
        double num1 = entrada3.nextDouble();

        System.out.println("Digite outro número");
        double num2 = entrada3.nextDouble();

        Double num1W = num1;
        Double num2W = num2;

        Double somaW = num1W + num2W;
        System.out.println(somaW);
        Double subW = num1W - num2W;
        System.out.println(subW);
        Double multW = num1W * num2W;
        System.out.println(multW);
        Double divW = num1W / num2W;
        if (num2W == 0){
            System.out.println("Número inválido: Não existe divisão por zero");
        }
        System.out.println(divW);

    }

    public static void Character(){
        System.out.println("Character");

        Scanner entrada4 = new Scanner(System.in);

        System.out.println("Digite uma letra (minúscula): ");
        char letra = entrada4.next().charAt(0);



        if (Character.isLetter(letra)){

            letra = Character.toLowerCase(letra);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("Vogal");
            } else {
                System.out.println("Consoante");
            }

        }else {
                System.out.println("Erro: Não é uma letra");
            }
        entrada4.close();
    }

    public static void Boolean(){
        System.out.println("Boolean");

        Scanner entrada5 = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada5.nextInt();

        Boolean numero = num > 0;

        System.out.println(numero);
        entrada5.close();

    }

    public static void MetodosUtilitarios(){
        System.out.println("Metodos utilitarios");

        Integer num = Integer.parseInt("8");
        System.out.println(num);

        Double doubleW = Double.valueOf(num);
        System.out.println(doubleW);

        Boolean booleanW = Character.isDigit(num);
        System.out.println(booleanW);


    }

    public static void Nulo(){
        System.out.println("Nulo");

        Scanner entrada6 = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double doubleW = entrada6.nextDouble();

        double doublePrimitivo = doubleW;

        System.out.println(doublePrimitivo);
        entrada6.close();


    }
}
