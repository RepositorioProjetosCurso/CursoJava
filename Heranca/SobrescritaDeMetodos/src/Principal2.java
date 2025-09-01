import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        ContaInvestimento c1 = new ContaInvestimento();
        c1.setTitular(new Titular("João Da Silva", "11122233344"));
        c1.setAgencia(1234);
        c1.setNumero(999999);

        c1.imprimirDemonstrativo();

        c1.depositar(200);
        c1.imprimirDemonstrativo();

        c1.sacar(50.75);
        c1.imprimirDemonstrativo();

        c1.creditarRendimentos(6);
        c1.imprimirDemonstrativo();
    }
}
