package com.estudo.arquivos.revisao.revisaopoo.associacao.teste;

import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Estudante;
import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Local;
import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Professor;
import com.estudo.arquivos.revisao.revisaopoo.associacao.dominio.Seminario;

public class TesteSeminario {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Zenitsu");
        Estudante estudante2 = new Estudante("Tangiro");
        Estudante estudante3 = new Estudante("Inosuke");
        Estudante[] estudantes = {estudante1, estudante2, estudante3};
        Seminario seminario1 = new Seminario("Arco da Vila do Ferreiro");
        Seminario seminario2 = new Seminario("Arco do Entrentenimento");
        Seminario seminario3 = new Seminario("Arco do Treinamento Hashira");
        Seminario[] seminarios = {seminario1, seminario2, seminario3};
        Local local = new Local("Japão");
        Professor professor = new Professor("Rengoku", "Respiração das Chamas");

        System.out.println("Estuante 1");
        estudante1.setSeminario(seminario1);
        estudante1.imprime();
        System.out.println("---------");

        System.out.println("Estuante 2");
        estudante2.setSeminario(seminario2);
        estudante2.imprime();
        System.out.println("---------");

        System.out.println("Estuante 3");
        estudante3.setSeminario(seminario3);
        estudante3.imprime();
        System.out.println("---------");

        System.out.println("Seminário tem varios estudantes");
        seminario1.setEstudantes(estudantes);
        for (Estudante estudante : estudantes) {
            estudante.imprime();
        }
        System.out.println("--------");

        System.out.println("Professor ministra varios seminários");
        professor.setSeminarios(seminarios);
        for (Seminario seminario : seminarios) {
            seminario.imprime();
        }
        System.out.println("Seminario tem local");
        seminario1.setLocal(local);
        seminario1.imprime();
        System.out.println("--------");

    }
}
