package com.algaworks.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui Conta Bancária.");
        }

        System.out.printf("DEBUG: Efetuando Transferência para %s no valor de %.2f", beneficiario.getNome(), documento.getValorTotal());
    }
}
