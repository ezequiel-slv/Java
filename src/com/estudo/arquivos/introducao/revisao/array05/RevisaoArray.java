package com.estudo.arquivos.introducao.revisao.array05;

public class RevisaoArray {
    public static void main(String[] args) {
        exe01();
    }

    public static void exe01(){
        int[] venda = new int[12];

        venda[0] = 40;
        venda[1] = 32;
        venda[2] = 55;
        venda[3] = 123;
        venda[4] = 89;
        venda[5] = 45;
        venda[6] = 67;
        venda[7] = 54;
        venda[8] = 140;
        venda[9] = 212;
        venda[10] = 134;
        venda[11] = 231;

        int soma = 0;
        for (int vendas : venda){
            soma +=vendas;
        }
        System.out.println("Soma de vendas no ano: " + soma);
    }
}
