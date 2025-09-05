package com.estudo.arquivos.poo03.corepoo.heranca08.dominio;

public class Animal {
    protected String animal;
    protected String especie;
    protected String peso;
    protected String idade;
    private Tutor tutor;

    public Animal(String animal) {
        this.animal = animal;
    }

    public Animal(String animal, String especie, String peso, String idade, Tutor tutor){
        this(animal);
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        this.tutor = tutor;
    }

    public void imprime(){
        if (tutor != null){
            System.out.println("Tutor: " + tutor.getNome());
            System.out.println("CPF tutor: " + tutor.getCpf());
        }
        System.out.println("Animal: " + this.animal);
        System.out.println("especie: " + this.especie);
        System.out.println("peso: " + this.peso);
        System.out.println("idade: " + this.idade);

    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
