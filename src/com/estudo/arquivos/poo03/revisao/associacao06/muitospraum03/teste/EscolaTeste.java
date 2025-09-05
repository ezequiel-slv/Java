package com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio.Escola;
import com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Nanami");
        Professor professor2 = new Professor("Gojo Satoru");

        Professor[] professors = {professor1, professor2};
        Escola escola = new Escola("Escola de feitiçeiros Tokyo", professors);

        escola.imprimir();
    }
}
