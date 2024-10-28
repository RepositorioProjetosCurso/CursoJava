public class Carro {

    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoFabricacao;

    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        double valorRevendaCarro = calcularValorRevenda();
        int tempoDeUsoDoCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso em anos: %d%n", calcularTempoDeUsoEmAnos());
        System.out.printf("Valor de revenda: %.2f%n", calcularValorRevenda());
    }

    double calculaIPVA() {
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        int anoAtual = 2024;
        return anoAtual - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}