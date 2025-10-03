import src.com.algaworks.banco.Conta;
import src.com.algaworks.banco.Titular;

public class Principal {
    public static void main(String[] args) {

        Titular titular = new Titular("Jonas Da Baleia", "12312312300");
        Conta c1 = new Conta(titular, 1234, 999999);
        Conta c2 = new Conta(titular, 1234, 999999);
        Conta c3 = new Conta(titular, 1234, 999999);

//      Precisam todas ser true devido a consistencia nas informações
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));

        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c1));
    }
}
