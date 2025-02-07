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

        if (num2 != 0){
            return num1/num2;
        }
        return 0;
    }

    public int divDoisNumerosTipoDois (int num1, int num2){

        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void divDoisNumerosTipoTres (int num1, int num2){
        if(num2 == 0){
            System.out.println("Divisão por zero não existe");
            return;
        }
        System.out.println(num1/num2);
    }

    public void variavelDominio (int num1, int num2){
        num1 = 20;
        num2 = 5;

        System.out.println("Variavel do dominio");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
