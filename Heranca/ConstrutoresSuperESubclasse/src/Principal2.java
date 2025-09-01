import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        Titular joao = new Titular("João Da Silva", "11122233344");
        ContaInvestimento c1 = new ContaInvestimento(joao, 1234, 999999);

        c1.imprimirDemonstrativo();

        c1.depositar(200);
        c1.imprimirDemonstrativo();

        c1.sacar(50.75);
        c1.imprimirDemonstrativo();

        c1.creditarRendimentos(6);
        c1.imprimirDemonstrativo();
    }
}
