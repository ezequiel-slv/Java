package com.revisao.arquivos.poo02.introducaometodos02.dominio;

public class Metodos01 {

    public void imprime(){
        System.out.println(olamundo());
        System.out.println(olanome());
        imparpar();
        tabuada();
        numeromaior();
    }

    public String olamundo(){
        return "Olá Mundo!";
    }

    public String olanome(){
        String nome = "Ezequiel";
        return "Olá " + nome;
    }

    public void imparpar(){
        int num = 4;
        if (num % 2 == 0){
            System.out.println("é par");
        }else {
            System.out.println("é impar");
        }
    }

    public void tabuada(){
        int num = 5;
        for (int a = 1; a <= 10; a++){
            System.out.println(num + " x " + a + " = "  + (num * a));
        }
    }

    public void numeromaior(){
        int num1 = 3;
        int num2 = 6;
        if (num1 > num2){
            System.out.println(num1 + " > " + num2);
        }else {
            System.out.println(num1 + " < " + num2);
        }
    }


}
