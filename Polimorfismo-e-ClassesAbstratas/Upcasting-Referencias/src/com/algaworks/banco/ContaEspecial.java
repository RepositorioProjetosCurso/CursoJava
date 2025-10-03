package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    protected final void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiente para saque!");
        }
    }

    @Override
    public final void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo Disponível: %.2f%n", getSaldoDisponivel());
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "titular= " + getTitular() +
                ", agencia= " + getAgencia() +
                ", numero= " + getNumero() +
                ", valorTotalRendimentos=" + getValorTotalRendimentos() +
                ", tarifaMensal=" + tarifaMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                "} ";
    }
}