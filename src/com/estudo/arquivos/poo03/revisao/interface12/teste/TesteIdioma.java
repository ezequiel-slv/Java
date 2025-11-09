package com.estudo.arquivos.poo03.revisao.interface12.teste;

import com.estudo.arquivos.poo03.revisao.interface12.dominio.EnUs;
import com.estudo.arquivos.poo03.revisao.interface12.dominio.Idioma;
import com.estudo.arquivos.poo03.revisao.interface12.dominio.PtBr;

public class TesteIdioma {
    public static void main(String[] args) {
        Idioma ptbr = new PtBr();
        Idioma enus = new EnUs();

        ptbr.idioma();
        enus.idioma();
    }
}
