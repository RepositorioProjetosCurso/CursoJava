package com.algaworks.seguro.modelo;

public abstract class VeiculoAutomotor implements BemSeguravel {

    protected String modelo;
    protected int anoFabricacao;
    protected double valorMercado;

    public VeiculoAutomotor(String modelo, int anoFabricacao, double valorMercado) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    @Override
    public double calcularValorPremio() {
        return 0;
    }

    @Override
    public String descrever() {
        return "";
    }
}
