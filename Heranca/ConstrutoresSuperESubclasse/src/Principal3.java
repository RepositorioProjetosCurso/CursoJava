import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        Titular joao = new Titular("João Da Silva", "11122233344");
        ContaEspecial c1 = new ContaEspecial(joao, 1234, 999999, 90);
        c1.setLimiteChequeEspecial(1500);

        c1.imprimirDemonstrativo();

        c1.depositar(150);
        c1.imprimirDemonstrativo();

        c1.sacar(300.75);
        c1.imprimirDemonstrativo();

        c1.debitarTarifaMensal();
        c1.imprimirDemonstrativo();
    }
}
