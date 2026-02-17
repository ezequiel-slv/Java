package com.estudo.arquivos.introducao01.estruturascondicionais03;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        //taxa em cima do salário
        // de 0 a 34,712 - 10%
        // de 34,713 a 68,587 - 37%
        // 68,588 - 50%

        double salarioAnual = 75000;
        double primeiraFaixa = 0.1;
        double segundaFaixa = 0.37;
        double terceiraFaixa = 0.5;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34713 && salarioAnual == 68587){
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
