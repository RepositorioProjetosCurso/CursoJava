package com.algabank;

import com.javabank.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
        AuditoriaDecorator c1 = new AuditoriaDecorator(new ContaCorrente());

        c1.depositar(1000);
        c1.sacar(100);

        System.out.printf("Saldo da Conta 1: R$ %.2f%n", c1.getSaldo());
        System.out.printf("Operações: %d%n", c1.getQuantiddadeOperacoes());
    }
}
