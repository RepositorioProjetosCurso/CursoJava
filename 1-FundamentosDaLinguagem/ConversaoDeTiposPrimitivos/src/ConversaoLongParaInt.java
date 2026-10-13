public class ConversaoLongParaInt {
    public static void main(String[] args) {

//      Sem perca de informação
        {
            long x = 10;

//          int y = x; Sem casting não compila
            int y = (int) x; // Com casting compila

            System.out.println(x);
            System.out.println(y);
        }

//      Com perca de informação
        {
            long a = 9300000035L;
            int b = (int) a;

            System.out.println(a);
            System.out.println(b);
        }
    }
}
