package com.estudo.arquivos.poo.revisao.exception14.runtime;

import com.estudo.arquivos.poo.revisao.exception14.dominio.MetodoNaoSuportado;

import java.util.Collections;
import java.util.List;

public class UnsupportedOperationException {
    public static void main(String[] args) {
        /* UnsupportedOperationException acontece quando se tenta adicionar, alterar ou remover
        elementos de listas imutáveis
         */
        List<String> lista = Collections.unmodifiableList(List.of("A", "B", "C"));

        System.out.println(lista);
        //lista.add("D"); //UnsupportedOperationException

        /*
        Usave o UnsupportedOperationException para impedir alterações que podem comprometer
        o funcionamento do projeto (Tentar excluir o banco de dados)
         */
        MetodoNaoSuportado teste = new MetodoNaoSuportado();
        teste.excluir();
    }
}
