package com.algaworks.seguro.modelo;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, int anoFabricacao, double valorMercado, int quantidadeEixos) {
        super(modelo, anoFabricacao, valorMercado);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double taxa = 0.04 + (quantidadeEixos * 0.005);
        return valorMercado * taxa;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão: %s (%d) - %d eixos - Valor de mercado: R$ %.2f", modelo, anoFabricacao, quantidadeEixos, valorMercado);
    }
}
