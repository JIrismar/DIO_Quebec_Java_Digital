package com.dio.model;

import java.util.List;
import java.util.ArrayList;

public abstract class Conta {

    private double saldo;
    private final List<Double> movimento;

    Conta(){
        this.saldo = 0.00;
        this.movimento = new ArrayList<>();
    }

    public void depositar(double valor){
        this.saldo += valor;
        this.movimento.add(valor);
    }

    public void sacar(double valor){
        this.saldo -= valor;
        this.movimento.add(-valor);
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirMovimento(){
        System.out.println("= Movimentacao =====");
        for (Double vl : this.movimento) {
            var T = (vl > 0) ? "C" : "D";

            System.out.printf("      %.2f %s%n", vl, T);
        }
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("-----------------------");
    }

    public void imprimirExtrato(){}
}
