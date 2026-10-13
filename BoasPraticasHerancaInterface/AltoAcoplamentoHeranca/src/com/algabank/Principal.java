package com.algabank;

import com.javabank.Conta;
import com.javabank.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrenteComTributacao();
        Conta c2 = new ContaCorrente();

        c1.depositar(1000);
//        c1.sacar(100);
        c1.transferir(c2, 100);
//        c1.aplicarInvestimento(100);

        System.out.printf("Saldo da Conta 1: R$ %.2f%n", c1.getSaldo());
        System.out.printf("Saldo da Conta 2: R$ %.2f%n", c2.getSaldo());
    }
}
