package com.estudo.arquivos.poo.revisao.exception14.trywithresource;

import com.estudo.arquivos.poo.revisao.exception14.trywithresource.dominio.Leitor1;
import com.estudo.arquivos.poo.revisao.exception14.trywithresource.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourceTeste {
    public static void main(String[] args) {
        TryWithResource();
    }

    public static void TryWithResource(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
