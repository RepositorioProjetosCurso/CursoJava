public class Main {
    public static void main(String[] args) {

        int totalDownloads = 10;

        // Operações de Incremento e Decremento(Pós e Pré Fixado)

        totalDownloads++; // Incremento Pós-Fixada
        System.out.println("Total downloads: " + totalDownloads);

        totalDownloads--; // Decremento Pós-Fixada
        System.out.println("Total downloads: " + totalDownloads);

        ++totalDownloads; // Incremento Pré-Fixada
        System.out.println("Total downloads: " + totalDownloads);

        --totalDownloads; // Decremento Pré-Fixada
        System.out.println("Total downloads: " + totalDownloads);
    }
}
