package com.algaworks.financeira.modelo;

public class ParceiroFinanceiro extends EmpresaFinanciavel {

    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public double getValorAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado) {
        valorTotalAplicado += valorAplicado;
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }
}
