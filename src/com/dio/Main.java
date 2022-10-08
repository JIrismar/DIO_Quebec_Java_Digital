package com.dio;

import com.dio.model.Conta;
import com.dio.model.ContaCorrente;
import com.dio.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(250.0);
        cc.depositar(100.0);
        cc.transferir(50, cp);
        cc.depositar(150.00);

        cp.sacar(12.75);
        cp.depositar(35.5);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
