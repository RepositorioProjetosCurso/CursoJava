package com.algabank;

import com.javabank.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator {

    private int quantiddadeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantiddadeOperacoes() {
        return quantiddadeOperacoes;
    }

    @Override
    public void sacar(double valor) {
        quantiddadeOperacoes++;
        getContaOriginal().sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantiddadeOperacoes++;
        getContaOriginal().depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        quantiddadeOperacoes++;
        getContaOriginal().transferir(conta, valor);
    }

    @Override
    public void aplicarInvestimento(double valor) {
        quantiddadeOperacoes++;
        getContaOriginal().aplicarInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {
        quantiddadeOperacoes++;
        getContaOriginal().imprimirSaldo();
    }
}
