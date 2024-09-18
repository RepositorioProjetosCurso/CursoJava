public class Main {
    public static void main(String[] args) {

        long x = 10;
        int y = (int) x; // (int) é um casting para a conversão funcionar

        System.out.println(x);
        System.out.println(y);

        long a = 9300000035L;
        int b = (int) a; // Casting com perda de informação

        System.out.println(a);
        System.out.println(b);
    }
}