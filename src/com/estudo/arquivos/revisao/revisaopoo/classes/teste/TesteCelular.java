package com.estudo.arquivos.revisao.revisaopoo.classes.teste;

import com.estudo.arquivos.revisao.revisaopoo.classes.dominio.Celular;

public class TesteCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();

        celular1.marca = "Iphone 16e";
        celular1.preco = 7.000;
        celular1.ano = 2025;

        celular1 = celular2;

        celular2.marca = "Galaxy S23 Ultra";
        celular2.preco = 7.500;
        celular2.ano = 2023;

        System.out.println("1 opção de compra");
        System.out.println(celular1.marca + " " + celular1.ano + " 64GB " + " por " + celular1.preco);

        System.out.println("---------");

        System.out.println("2 opção de compra");
        System.out.println(celular2.marca + " "+ celular2.ano + " 128GB " + " por " + celular2.preco);

    }
}
