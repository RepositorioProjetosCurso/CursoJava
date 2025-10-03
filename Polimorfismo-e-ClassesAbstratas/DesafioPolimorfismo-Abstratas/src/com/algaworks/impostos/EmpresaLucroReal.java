package com.algaworks.impostos;

public class EmpresaLucroReal extends PessoaJuridica{

    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        double lucro = getLucroAnual();
        return lucro > 0 ? lucro * ALIQUOTA_IMPOSTO_LUCRO : 0;
    }
}
