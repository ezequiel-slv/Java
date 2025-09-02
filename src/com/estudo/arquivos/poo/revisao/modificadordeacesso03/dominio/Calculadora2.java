package com.estudo.arquivos.poo.revisao.modificadordeacesso03.dominio;

import java.util.Scanner;

public class Calculadora2 {
    private int num1;
    private int num2;
    private int num3;
    private double num4;
    private double num5;
    private double soma;


    public void Somar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.soma = num1 + num2;
    }

    public void Somar(int num1, int num2, int num3){
        this.Somar(num1, num2);
        this.num3 = num3;
        this.soma = num1 + num2 + num3;
    }

    public void Somar(int num1, int num2, int num3, double num4, double num5){
        this.Somar(num1, num2, num3);
        this.num4 = num4;
        this.num5 = num5;
        this.soma = num1 + num2 + num3 + num4 + num5;
    }

    public void imprime(){
        System.out.println("Soma: " + this.soma);
    }

    public double getSoma() {
        return soma;
    }
}