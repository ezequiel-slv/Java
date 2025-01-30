package com.estudo.arquivos.introducao;

public class Array03 {
    public static void main(String[] args) {
        String[] dia = new String[7];
        dia[0] = "Segunda";
        dia[1] = "Terça";
        dia[2] = "Quarta";
        dia[3] = "Quinta";
        dia[4] = "Sexta";
        dia[5] = "Sábado";
        dia[6] = "Domingo";

        //foreach
        for (String diaSemana : dia) {
            System.out.println(diaSemana);
        }
    }
}
