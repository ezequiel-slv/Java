package com.estudo.arquivos.poo.corepoo.interfac12.dominio2;

import java.util.Scanner;

public class Funcionario extends Pessoa implements VerificadorDeAusencia{
    private double salario;

    public void imprime(){
        super.imprime();
        if (salario != 0.0){
            System.out.println("Salário: " + this.salario);
        }else{
            System.out.println("Salário não adicionado");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void validarPresenca() {
        Scanner entrada = new Scanner(System.in);


        while (true){

            System.out.println("Digite o código para validar a presença: ");
            int codVal = entrada.nextInt();

            boolean condicao = codVal == code;

            if (condicao){
                System.out.println("Presença validada!");
                break;
            }else{
                System.out.println("Código incorreto! Tente novamente.");
            }
            entrada.close();
        }
    }
}
