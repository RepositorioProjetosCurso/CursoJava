package com.algaworks.seguro.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
        super(modelo, anoFabricacao, valorMercado);
    }

    @Override
    public double calcularValorPremio() {
        return valorMercado * 0.5;
    }

    @Override
    public String descrever() {
        return String.format("Carro Particular: %s (%d) - Valor de mercado: R$ %.2f", modelo, anoFabricacao, valorMercado);
    }
}
