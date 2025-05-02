package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (seminarios != null){
            for (Seminario seminario : seminarios){
                System.out.println(seminario.getNome());
            }
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }
}
