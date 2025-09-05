package com.estudo.arquivos.exception04.revisao.exceptionchecked;

import java.io.File;
import java.io.IOException;

public class ExceptionChecked {
    public static void main(String[] args) {
        createFile();
    }

    public static void createFile(){
        File file = new File("folder//file.txt");

        try {
            boolean fileCrated = file.createNewFile();
            //boolean delete = file.delete();

            System.out.println("Arquivo criado: " + fileCrated);
            //System.out.println("Arquivo deletado: " + delete);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
