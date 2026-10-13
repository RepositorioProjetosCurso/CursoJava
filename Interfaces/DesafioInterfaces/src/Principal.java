import com.algaworks.seguro.modelo.BemSeguravel;
import com.algaworks.seguro.modelo.Caminhao;
import com.algaworks.seguro.modelo.CarroParticular;
import com.algaworks.seguro.modelo.ImovelResidencial;
import com.algaworks.seguro.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {

        BemSeguravel carro = new CarroParticular("Civic", 120_000, 2022);
        BemSeguravel caminhao = new Caminhao("Volvo FH", 350_000, 2020, 4);
        BemSeguravel casa = new ImovelResidencial(500_000, 200);

        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();

        servico.emitir(carro);
        servico.emitir(caminhao);
        servico.emitir(casa);
    }
}
