package com.estudo.arquivos.introducao01.array05;

public class Array06Inici {
    public static void main(String[] args) {
        int[][] Arrayint = new int[3][0];

        Arrayint [0] = new int[2];
        Arrayint [1] = new int[4];
        Arrayint [3] = new int[6];

        for (int[] arrayBase : Arrayint) {
            System.out.println("\n------");
        for (int num: arrayBase) {
            System.out.print(num + "------");
        }
        }
    }
}
