package com.estudo.arquivos.introducao.coreintroducao.array05;

public class Array04 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6 meses
        // 1, 2, 3, 4, 5, dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
