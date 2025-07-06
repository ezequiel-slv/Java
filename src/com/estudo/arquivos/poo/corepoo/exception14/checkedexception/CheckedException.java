package com.estudo.arquivos.poo.corepoo.exception14.checkedexception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        creatFile(entrada);
        entrada.close();

    }

    private static void creatFile(Scanner entrada) throws IOException{

        System.out.println("Digite o nome do arquivo: ");
        String fileName = entrada.next();

        File file = new File("arquivo" + File.separator + fileName + ".txt");

        try{
            if (!file.exists()){
                boolean newFile = file.createNewFile();
                System.out.println("Arquivo criado: " + newFile);
            }else{
                System.out.println("Arquivo já existe");
            }
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
