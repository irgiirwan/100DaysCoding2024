package SeratusHariJava;

public class Day66 {

    public static void main(String[] args) {
        // Pola Persegi dan Persegi Panjang

        System.out.println("#Pola Persegi");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("#Pola Persegi Panjang");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
