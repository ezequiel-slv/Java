package com.core.poo02.introducaoclasses01.teste;

import com.core.poo02.introducaoclasses01.dominio.Professor;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();

        System.out.println("Professor " + professor.nome + ", Idade: " + professor.idade + ", sexo: " + professor.sexo);
    }
}