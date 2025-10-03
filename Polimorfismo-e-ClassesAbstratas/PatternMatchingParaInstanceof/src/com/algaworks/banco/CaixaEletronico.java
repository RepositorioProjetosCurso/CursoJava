package com.algaworks.banco;

public class CaixaEletronico {

    public static final int TARIFA_TRANSFERENCIA = 10;
    public static final int TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para conta %d/%d%n",
            valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemonstrativo(Conta conta) {
        verificaTipoDeConta(conta);
        conta.imprimirDemonstrativo();
    }

    private static void verificaTipoDeConta(Conta conta) {
//        Uso do Pattern Matching
        if (conta instanceof ContaInvestimento contaInvestimento && contaInvestimento.getValorTotalRendimentos() > 0) {
            System.out.println("Impressão do demonstrativo é gratuita!");
            } else {
                debitarTarifaImpressaoDemonstrativo(conta);
            }
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$%d", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}