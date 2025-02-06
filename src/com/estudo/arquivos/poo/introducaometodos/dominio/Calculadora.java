package com.estudo.arquivos.poo.introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(20 + 20);
    }

    public void subDoisNumeros(){
        System.out.println(30 - 20);
    }

    public void multDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public int divDoisNumeros(int num1, int num2){
        return num1/num2;
    }
}
