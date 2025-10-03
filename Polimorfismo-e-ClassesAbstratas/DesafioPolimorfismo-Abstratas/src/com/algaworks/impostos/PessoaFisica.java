package com.algaworks.impostos;

public class PessoaFisica extends Pessoa {

    public final static double RECEITA_ANUAL_ISENCAO = 5_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if (receitaAnual <= RECEITA_ANUAL_ISENCAO) {
            return 0;
        }
        return (receitaAnual - RECEITA_ANUAL_ISENCAO) * ALIQUOTA_IMPOSTO_RENDA;
    }
}
