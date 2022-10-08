package com.dio.model;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("= Extrato C/C ======");
        super.imprimirMovimento();
    }
}
