package com.dio.model;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("= Conta Poupanca ===");
        super.imprimirMovimento();
    }
}
