package com.estudo.arquivos.poo03.revisao.exception14.teste;

import com.estudo.arquivos.poo03.revisao.exception14.dominio.Arquivo01;

import java.io.File;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Arquivo01 arquivo01 = new Arquivo01()){
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
