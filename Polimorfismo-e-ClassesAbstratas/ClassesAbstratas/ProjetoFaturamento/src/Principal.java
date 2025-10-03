import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Principal {
    public static void main(String[] args) {
        GestorFiscal gestorFiscal = new GestorFiscal();

        var nfBolaDeFutebol = new NotaFiscalProduto("Bola de Futebol", 300, 12.50);
        var nfReparoMotor = new NotaFiscalServico("Reparo cabeçote", 1050, false);

        gestorFiscal.emitirNotasFiscais(nfBolaDeFutebol, nfReparoMotor);

//        System.out.println(nfBolaDeFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }
}
