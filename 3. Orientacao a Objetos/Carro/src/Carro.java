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

        if (precoCompra <= 0) {
            System.out.println("Carro com preço zerado devido tempo de uso");
            return;
        } else  {
            System.out.printf("Tempo de uso em anos: %d%n", calcularTempoDeUsoEmAnos());
            System.out.printf("Valor de revenda: %.2f%n", calcularValorRevenda());
        }
    }

    double calculaIPVA() {
        double tempoDeUsoEmAnos = calcularValorRevenda();
        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }
        return tempoDeUsoEmAnos * 0.04;
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