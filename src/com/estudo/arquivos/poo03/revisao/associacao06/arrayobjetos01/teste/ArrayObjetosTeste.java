package com.estudo.arquivos.poo03.revisao.associacao06.arrayobjetos01.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.arrayobjetos01.dominio.ArrayObjetos;

public class ArrayObjetosTeste {
    public static void main(String[] args) {
        ArrayObjetos pais1 = new ArrayObjetos("Brasil");
        ArrayObjetos pais2 = new ArrayObjetos("Estados Unidos");
        ArrayObjetos pais3 = new ArrayObjetos("Uruguai");

        ArrayObjetos[] arrayObjetos = {pais1, pais2, pais3};
        for (ArrayObjetos arrayObjeto : arrayObjetos) {
            arrayObjeto.imprime();
        }
    }
}
