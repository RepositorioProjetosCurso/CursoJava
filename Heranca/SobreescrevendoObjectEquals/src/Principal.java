import src.com.algaworks.banco.Conta;
import src.com.algaworks.banco.Titular;

public class Principal {
    public static void main(String[] args) {

        Titular titular = new Titular("Jonas Da Baleia", "12312312300");
        Conta c1 = new Conta(titular, 1234, 999999);
        Conta c2 = new Conta(titular, 1234, 999999);

        System.out.println(c1.equals(c2));
    }
}
