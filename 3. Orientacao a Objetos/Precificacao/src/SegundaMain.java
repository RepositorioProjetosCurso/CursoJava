public class SegundaMain {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();


        Produto.custoEmbalagem = 7.5;
//        prod1.custoEmbalagem = 10;
//        prod2.custoEmbalagem = 12;

        prod1.imprimeCustoEmbalagem();
        prod2.imprimeCustoEmbalagem();
    }
}
