import com.algaworks.banco.*;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Joao", "12312312300"), 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Joao", "12312312300"), 1234, 999999);
        conta2.depositar(100);

        ContaSalario conta3 = new ContaSalario(new Titular("Joao", "12312312300"), 1234, 999999, 18_000);
        conta3.depositar(100);

        caixaEletronico.imprimirDemonstrativo(conta1);
        caixaEletronico.imprimirDemonstrativo(conta2);
        caixaEletronico.imprimirDemonstrativo(conta3);
    }
}