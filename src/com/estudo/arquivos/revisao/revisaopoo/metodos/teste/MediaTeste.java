package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.Media;

public class MediaTeste {
    public static void main(String[] args) {
        Media media = new Media();

        media.imprime();
        media.setNumeros(40,30,10);
        System.out.println(media.getNum1());
        System.out.println(media.getNum2());
        System.out.println(media.getNum3());
        System.out.println(media.getMedia());


    }
}
