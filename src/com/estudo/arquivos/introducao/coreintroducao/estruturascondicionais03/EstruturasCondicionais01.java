package com.estudo.arquivos.introducao.coreintroducao.estruturascondicionais03;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean condicao1 = idade >= 18;

        if (condicao1) {
            System.out.println("Permitido para dirigir");
        }
        //  ! nega a senteça retornando o contrario de verdadeiro caso a condição seja falsa
        if(! condicao1) {
            System.out.println("Não permitido para dirigir");
        }
    }

}
