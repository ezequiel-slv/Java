package com.estudo.arquivos.poo.revisao.introducaometodos02.Teste;

import com.estudo.arquivos.poo.revisao.introducaometodos02.dominio.VarArgs3;

public class VarArgsTeste03 {
    public static void main(String[] args) {
        VarArgs3 args3 = new VarArgs3();
        args3.somaVarArgs(2, 4, 6, 8, 10);
        args3.subVarArgs(10, 20, 30, 40);
        args3.multVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        args3.divVarArgs(1, 2, 3, 4);
    }
}
