public class ConcatenacaoString {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        System.out.println("Fala, Mergulhador!");
        System.out.println("Resultado: " + x + y); // Serve apenas como concatenação.
        System.out.println(x + y + " Foi o resultado."); // Identifica primeiro a soma e depois concatena.

        System.out.println("Resultado: " + (x + y));
    }
}
