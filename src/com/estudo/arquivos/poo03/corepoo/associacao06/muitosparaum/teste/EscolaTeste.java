package com.estudo.arquivos.poo03.corepoo.associacao06.muitosparaum.teste;

import com.estudo.arquivos.poo03.corepoo.associacao06.muitosparaum.dominio.Escola;
import com.estudo.arquivos.poo03.corepoo.associacao06.muitosparaum.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Minato Sensei");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);
        
        escola.imprime();
    }
}
