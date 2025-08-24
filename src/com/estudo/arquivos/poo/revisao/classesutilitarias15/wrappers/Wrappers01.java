package com.estudo.arquivos.poo.revisao.classesutilitarias15.wrappers;

public class Wrappers01 {
    public static void main(String[] args) {
        ValoresEmTipos();
        ValoresEmClasse();
    }

    public static void ValoresEmTipos(){
        //valor guardado em tipos --> bites

        byte byteT = 1;
        short shortT = 3;
        int intT = 20;
        long longT = 12323233;
        double doubleT = 2.1;
        float floatT = 0.9F;
        char charT = 'E';
        boolean booleanB = true;

    }

    public static void ValoresEmClasse(){
        // valor guardado em classe --> Objetos

        Byte byteC = 1;
        Short shortC = 3;
        Integer integerC = 20;
        Long longC = 12323233L;
        Double doubleC = 2.1;
        Float floatC = 0.9F;
        Character characterC = 'E';
        Boolean booleanC = true;
    }
}
