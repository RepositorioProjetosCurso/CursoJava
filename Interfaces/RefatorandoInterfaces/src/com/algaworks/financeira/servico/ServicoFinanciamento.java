package com.algaworks.financeira.servico;

import com.algaworks.financeira.modelo.ClienteFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel clienteFinanciavel, double valorSolicitado) {
        double limiteAprovado = clienteFinanciavel.calcularLimiteAprovado();

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite maximo é %.2f%n", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado. Limite máximo de %.2f%n", limiteAprovado);
    }

    public double consultarLimiteAprovado(ClienteFinanciavel clienteFinanciavel) {
        return clienteFinanciavel.calcularLimiteAprovado();
    }
}
