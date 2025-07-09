package com.estudo.arquivos.poo.revisao.introducaometodos02.Teste;

import com.estudo.arquivos.poo.revisao.introducaometodos02.dominio.VarArgs;

public class VarArgsTeste {
    public static void main(String[] args) {
        VarArgs Array = new VarArgs();
        int[] numeros = {1,2,3,4,5,6};
        Array.somaArray(numeros);

        Array.somaVarArgs(1,2,3,4,5,6,7,8);
    }
}
