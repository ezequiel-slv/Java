package com.estudo.arquivos.revisao;

public class exeLacoDeRepeticao {
    public static void main(String[] args) {
        
        double valorCarro = 50000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("parcela " + parcela + " R$ " + valorParcela);
            }else{
                break;
            }                      
        }
    }
}
