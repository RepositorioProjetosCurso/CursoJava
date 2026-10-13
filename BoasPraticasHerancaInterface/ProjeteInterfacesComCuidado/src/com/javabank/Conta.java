package com.javabank;

public interface Conta {

    double getSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta conta, double valor);

    void aplicarInvestimento(double valor);

//    É bom sempre projetar as interfaces antes de cria-las para eventuais problemas
    default void imprimirSaldo() {
        System.out.printf("Sue saldo é de R$%.2f%n", getSaldo());
    }
}
