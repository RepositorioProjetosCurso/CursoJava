package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    //    Serve para adicionar um método com implementação padrão diretamente em uma interface, sem quebrar a compatibilidade com classes que já a implementam
    default double calcularJuros(double valorSolicitado) {
        if (valorSolicitado <= 100_00) {
            return 1.0;
        } else if (valorSolicitado <= 1_000_000) {
            return 1.5;
        }

        return 2;
    }
}
