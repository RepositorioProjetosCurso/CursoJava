import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal4 {
    public static void main(String[] args) {

        Titular joao = new Titular("João da Silva", "12312312300");
        ContaInvestimento c1 = new ContaInvestimento(joao, 1234, 999999);
//        Conta c1 = new Conta(joao, 1234, 999999);

        System.out.println(c1);
    }
}
