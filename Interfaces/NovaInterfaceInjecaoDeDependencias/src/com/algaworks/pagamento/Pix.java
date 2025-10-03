package com.algaworks.pagamento;

public class Pix implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave Pix.");
        }

        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f", beneficiario.getNome(), documento.getValorTotal());
    }
}