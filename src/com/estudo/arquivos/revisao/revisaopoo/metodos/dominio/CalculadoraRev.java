package com.estudo.arquivos.revisao.revisaopoo.metodos.dominio;

public class CalculadoraRev {
    public int divideDoisNumeros(int num1, int num2) {
        if (num1/num2 == 0){
            return 0;
        }
        return(num1/num2);
    }

    public int divideDoisNumeros02(int num1, int num2) {
        if (num2 != 0){
            return(num1/num2);
        }
        return 0;
    }

    public void divisaoDoisNumeros(int num1, int num2){
        if (num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não existe divisão por zero");
    }
}
