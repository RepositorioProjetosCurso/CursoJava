import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial();
        c1.setTitular(new Titular("João Da Silva", "11122233344"));
        c1.setAgencia(1234);
        c1.setNumero(999999);
        c1.setLimiteChequeEspecial(2300);
        c1.setTarifaMensal(98.5);

        c1.imprimirDemonstrativo();

        c1.depositar(150);
        c1.imprimirDemonstrativo();

        c1.sacar(300.75);
        c1.imprimirDemonstrativo();

        c1.debitarTarifaMensal();
        c1.imprimirDemonstrativo();
    }
}
