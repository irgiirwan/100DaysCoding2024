package SeratusHariJava;

public class Day94 {

    public static void main(String[] args) {
        // Asterisk Pattern : Segitiga

        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
