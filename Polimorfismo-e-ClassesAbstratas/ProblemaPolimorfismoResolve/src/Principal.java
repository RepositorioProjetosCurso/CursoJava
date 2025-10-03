import com.algaworks.banco.*;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Joao", "12312312300"), 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1200);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Maria", "98798798711"), 4321, 111111, 70);

        ContaSalario conta3 = new ContaSalario(new Titular("Tainá", "65465465433"), 8521, 777777, 5_350);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta2, 150);

        caixaEletronico.transferir(conta1, conta3, 235);

        conta1.imprimirDemonstrativo();
        conta2.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();
    }
}