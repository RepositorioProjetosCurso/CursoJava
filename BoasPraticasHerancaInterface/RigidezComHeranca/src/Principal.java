import com.algaworks.locadora.Locacao;
import com.algaworks.locadora.LocacaoPorDia;
import com.algaworks.locadora.Notebook;

public class Principal {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Acer Predator (i7-13900 - 32GB Ram)", 5, 100);

        Locacao locacao = new LocacaoPorDia(notebook);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}
