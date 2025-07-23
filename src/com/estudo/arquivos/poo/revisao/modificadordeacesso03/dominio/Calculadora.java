package com.estudo.arquivos.poo.revisao.modificadordeacesso03.dominio;
public class Calculadora {
    public void somar(int[] somaDoisNumInt){
        int resultSomaDoisNumInt = 0;
        for (int i : somaDoisNumInt) {
            resultSomaDoisNumInt += i;
        }
        System.out.println("Soma dois números inteiros: " + resultSomaDoisNumInt);
    }

    public void somar(int[] somaDoisNumInt, int[] somaTresNumInt){
        this.somar(somaDoisNumInt);
        int resultSomaTresNumInt = 0;
        for (int i : somaTresNumInt) {
            resultSomaTresNumInt += i;
        }
        System.out.println("Soma três números inteiros: " + resultSomaTresNumInt);
    }

    public void somar(int[] somaDoisNumInt, int[] somaTresNumInt, double[] somaDoisNumDouble){
        this.somar(somaDoisNumInt, somaTresNumInt);
        double resultSomaDoisNumDouble = 0;
        for (double i : somaDoisNumDouble) {
            resultSomaDoisNumDouble += i;
        }
        System.out.println("Soma três números inteiros: " + resultSomaDoisNumDouble);
    }
}
