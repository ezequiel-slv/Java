package com.estudo.arquivos.introducao;

public class EsruturaDeRepeticao01 {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {  //executa uma condição repetidamente caso seja verdadeira
            System.out.println(count);
            count ++;
        }

        do{
            System.out.println("Dentro do do-while"); //executa uma condição uma vez mesmo sendo falsa
        }while (count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("for: " + i); // declara variável, condição e executa processo de soma
        }
    }
}
