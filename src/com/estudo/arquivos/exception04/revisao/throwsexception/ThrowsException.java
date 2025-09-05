package com.estudo.arquivos.exception04.revisao.throwsexception;

import java.io.File;
import java.io.IOException;

public class ThrowsException {
    public static void main(String[] args) throws IOException{
        try{
            createFile();
        }catch (IOException e){
            System.err.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void createFile() throws IOException{
        File file = new File("folder//notas.txt");

        try {
            boolean fileCrated = file.createNewFile();
            //boolean delete = file.delete();

            System.out.println("Arquivo criado: " + fileCrated);
            //System.out.println("Arquivo deletado: " + delete);
        }catch (IOException e){
            e.printStackTrace();
            throw new IOException("Falha ao criar arquivo, caminho inválido" + file.getAbsolutePath(), e);
        }
    }
}
