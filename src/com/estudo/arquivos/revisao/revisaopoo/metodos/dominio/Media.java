package com.estudo.arquivos.revisao.revisaopoo.metodos.dominio;

public class Media {
    private int num1;
    private int num2;
    private int num3;
    private int media;

    public void imprime (){
        System.out.println(this.num1);
        System.out.println(this.num2);
        System.out.println(this.num3);
    }
    public void setNumeros(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.media = (this.num1 + this.num2 + this.num3)/3;

    }

    public int getNum1(){
        System.out.println("Numero 1");
        return this.num1;
    }

    public int getNum2(){
        System.out.println("Numero 2");
        return this.num2;
    }

    public int getNum3(){
        System.out.println("Numero 3");
        return this.num3;
    }

    public int getMedia(){
        System.out.println("------");
        System.out.println("Media");
        return this.media;
    }
}
