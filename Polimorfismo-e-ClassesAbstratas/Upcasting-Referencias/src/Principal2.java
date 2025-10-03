import com.algaworks.banco.*;

public class Principal2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Jonas Da Baleia", "12312312300");
        Conta conta = new ContaSalario(titular, 1234, 999999, 18_000);
    }
}
