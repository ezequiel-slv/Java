package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.CalculadoraRev;

public class VarargsTeste {
    public static void main(String[] args) {
        CalculadoraRev varargs = new CalculadoraRev();
        CalculadoraRev array = new CalculadoraRev();
        int[] numeros = {1,2,3,4,5};
        array.somaArray(numeros);
        varargs.somaArrayVarargs(1,2,3,4,5,6,7,8);
    }
}
