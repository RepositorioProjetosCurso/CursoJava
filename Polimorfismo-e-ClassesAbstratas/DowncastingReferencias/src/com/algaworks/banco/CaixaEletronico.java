package com.algaworks.banco;

public class CaixaEletronico {

    public static final int TARIFA_TRANSFERENCIA = 10;
    public static final int TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

//    Usando o polimorfismo em Conta
    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para conta %d/%d%n",
            valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemonstrativo(Conta conta) {

//      Deve ser evitado o maximo possivel o Downcasting
        ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

        if(contaInvestimento.getValorTotalRendimentos() > 0) {
            System.out.println("Impressão do demonstrativo é gratuita!");
        } else {
            System.out.printf("Custo da impressão: %d", TARIFA_IMPRESSAO_DEMONSTRATIVO);
            conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
        }
        conta.imprimirDemonstrativo();
    }
}