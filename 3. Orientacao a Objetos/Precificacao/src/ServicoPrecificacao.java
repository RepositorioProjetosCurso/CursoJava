public class ServicoPrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemDeLucro) {
        double precoVendaCalculado = produto.precoCusto * ((percentualMargemDeLucro / 100) + 1);
        precoVendaCalculado +=Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
