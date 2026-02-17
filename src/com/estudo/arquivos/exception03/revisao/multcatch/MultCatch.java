package com.estudo.arquivos.exception03.revisao.multcatch;

public class MultCatch {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | ClassCastException e){
            throw e;
        }finally {
            System.out.println("Programa fechado");
        }


    }

    /*
    public static void teste01(){
        try{
            throw new ArithmeticException();
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | ClassCastException e){
            throw e;
        }finally {
            System.out.println("Programa fechado");
        }

     */


    }
/*
    public static void teste02() throws SQLException, FileNotFoundException {
        try {
            teste02();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Teste 2 finalizado");
        }
    }

 */
