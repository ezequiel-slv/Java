package com.revisao.arquivos.poo02.modificadordeacesso03.dominio;

public class Calculadora {
    int num1;
    int num2;
    int num3;

   public void somaInt(int num1, int num2) {
       this.num1 = num1;
       this.num2 = num2;
       int soma = num1 + num2;
       System.out.println(soma);
   }

   public void somaInt(int num1, int num2, int num3) {
       this.num1 = num1;
       this.num2 = num2;
       this.num3 = num1;
       int soma = num1 + num2 + num3;
       System.out.println(soma);
   }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
}
