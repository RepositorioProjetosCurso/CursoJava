package com.algaworks.financeira.modelo;

// Uma interface pode extender varias interfaces, diferente de classes
public interface PessoaBonificavel extends ClienteFinanciavel{

    double calcularBonus(double percentualMetaAlcancada);
}
