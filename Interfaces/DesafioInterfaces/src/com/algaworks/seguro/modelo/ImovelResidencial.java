package com.algaworks.seguro.modelo;

public class ImovelResidencial implements BemSeguravel {

    private int areaConstruida;
    private double valorMercado;

    public ImovelResidencial(int areaConstruida, double valorMercado) {
        this.areaConstruida = areaConstruida;
        this.valorMercado = valorMercado;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (valorMercado * 0.003) + (areaConstruida);
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial - Área: %d m² - Valor de mercado: R$ %.2f", areaConstruida, valorMercado);
    }
}
