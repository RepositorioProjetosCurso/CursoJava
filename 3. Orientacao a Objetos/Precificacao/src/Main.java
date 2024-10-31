public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        Produto.custoEmbalagem = 7.5;
//        prod1.precoCusto = 100;
        prod1.alterarPrecoCusto(80);

        ServicoPrecificacao service = new ServicoPrecificacao();
        service.definirPrecoVenda(prod1, 50);

        System.out.printf("Preço de Venda: %.2f", prod1.precoVenda);
    }
}