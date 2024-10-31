public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimeCustoEmbalagem() {
        System.out.printf("Custo com Embalagem: %f%n", Produto.custoEmbalagem);
    }
}
