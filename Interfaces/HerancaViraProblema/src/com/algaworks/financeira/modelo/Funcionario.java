package com.algaworks.financeira.modelo;

public class Funcionario extends EmpresaFinanciavel {

    public static final int QUANTIDADES_SALARIO_LIMITE_CREDITO = 5;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        super(nome, 0);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADES_SALARIO_LIMITE_CREDITO;
    }
}
