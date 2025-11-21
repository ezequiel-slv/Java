package com.estudo.arquivos.poo03.revisao.classesutilitarias15;

public class Wrappers {
    public static void main(String[] args) {
        byte Tbyte = 127;
        short Tshort = 2;
        int Tint = 1;
        long Tlong = 222222;
        float Tfloat = 1.4F;
        double Tdouble = 2.5;
        char Tchar = 'E';
        boolean Tboolean = true;

        Byte AutoboxingByte = Tbyte;

        Byte Cbyte = 127;
        Short Cshort = 2;
        Integer Cint = 1;
        Long Clong = 22222L;
        Float Cfloat = 1.4F;
        Double Cdouble = 2.5;
        Character Cchar = 'E';
        Boolean Cboolean = true;

        byte UnboxingByte = Cbyte;
    }
}
