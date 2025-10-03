import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.MetodoPagamento;
import com.algaworks.pagamento.Pix;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Pix();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("João Pontes", "85988888888", "123456");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Sapeca Brinquedos LTDA", "07123456000185", "987654");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(ordemServico);
    }
}
