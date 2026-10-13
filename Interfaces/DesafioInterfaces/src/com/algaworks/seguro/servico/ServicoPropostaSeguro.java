package com.algaworks.seguro.servico;

import com.algaworks.seguro.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bemSeguravel) {
        System.out.println("=== Proposta Seguro ===");
        System.out.println(bemSeguravel.descrever());
        System.out.printf("Valor do prêmio: R$ %.2f%n", bemSeguravel.calcularValorPremio());
        System.out.println("=================================\n");
    }
}
