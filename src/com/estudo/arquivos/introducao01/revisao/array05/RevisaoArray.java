package com.estudo.arquivos.introducao01.revisao.array05;

public class RevisaoArray {
    public static void main(String[] args) {
        exe01();
    }

    public static void exe01(){
        String[] meses = {"Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};

        int[] vendas = {40, 32, 55, 123, 89, 45, 67, 54, 140, 212, 134, 231};

        int soma = 0;
        int media = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.println(meses[i] + " | " + vendas[i]);
        }

        for (int venda : vendas){
            soma +=venda;
            media = soma / 12;
        }
        System.out.println("--------");
        System.out.println("Soma de vendas no ano: " + soma);
        System.out.println("--------");
        System.out.println("Média: " + media);
    }
}
