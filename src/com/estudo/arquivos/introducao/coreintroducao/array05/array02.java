package com.estudo.arquivos.introducao.coreintroducao.array05;

public class array02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        nomes[0] = "Ezequiel";
        nomes[1] = "Silva";
        nomes[2] = "Lima";
         
        //com laço de repetição
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
       //concatenado
        System.out.println(nomes[0]+" "+ nomes[1]+" "+ nomes[2]);
    }
}



