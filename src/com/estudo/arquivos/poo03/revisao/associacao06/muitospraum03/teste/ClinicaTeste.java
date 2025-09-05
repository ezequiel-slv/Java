package com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio.Clinica;
import com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio.Medico;

public class ClinicaTeste {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Roger");
        Medico medico2 = new Medico("Rosangela");
        Medico medico3 = new Medico("Fabio");
        Medico medico4 = new Medico("Clara");

        Medico[] medicos = {medico1, medico2, medico3, medico4};

        Clinica clinica = new Clinica("UltraMed", medicos);
        clinica.imprimir();
    }
}
