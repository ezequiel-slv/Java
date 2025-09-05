package com.estudo.arquivos.exception04.revisao.blockfinally;

public class Finally {
    public static void main(String[] args) {
        blockFinelly();
    }

    public static void blockFinelly(){
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
//            System.out.println("Escrvendo arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando arquivo");
        }
    }
}
