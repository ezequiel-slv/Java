package com.estudo.arquivos.poo03.revisao.estatico05.exercicio.dominio;

public class Usuario {
    private static int contadorUser;

    public Usuario() {
        contadorUser++;
    }

    public static void showUser(){
        System.out.println(contadorUser);
    }
}
