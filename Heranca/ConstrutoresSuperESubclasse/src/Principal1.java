import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular joao = new Titular("João Da Silva", "11122233344");
        Conta c1 = new Conta(joao, 1234, 999999);

        c1.imprimirDemonstrativo();

        c1.depositar(150);
        c1.imprimirDemonstrativo();

        c1.sacar(50.75);
        c1.imprimirDemonstrativo();
    }
}