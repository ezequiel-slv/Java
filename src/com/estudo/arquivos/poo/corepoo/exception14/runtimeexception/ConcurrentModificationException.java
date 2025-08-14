package com.estudo.arquivos.poo.corepoo.exception14.runtimeexception;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");

        for (String intem : lista){
            if (intem.equals("B")){ // intem guardando "B" do array
                lista.remove(intem); //tentando remover o item do array durante a execução
                System.out.println(lista);
            }
        }
    }
}
     /*
    ConcurrentModificationException é uma RuntimeException em Java que ocorre quando uma coleção é modificada
     */
