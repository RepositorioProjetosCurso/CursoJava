package com.algaworks.financeira.modelo;

public class Fazenda extends EmpresaFinanciavel {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE = 1.2;
    public static final double TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE = 5;

    private double tamanhoEHectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamanhoEHectares) {
        super(razaoSocial, totalFaturamento);
        this.tamanhoEHectares = tamanhoEHectares;
    }

    public double getTamanhoEHectares() {
        return tamanhoEHectares;
    }

    public void setTamanhoEHectares(double tamanhoEHectares) {
        this.tamanhoEHectares = tamanhoEHectares;
    }

    @Override
    public double calcularLimiteAprovado() {
        double limiteAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;
        if(getTamanhoEHectares() >= TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE) {
            limiteAprovado *= TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE;
        }
        return limiteAprovado;
    }
}
