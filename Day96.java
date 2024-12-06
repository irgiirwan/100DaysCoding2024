package SeratusHariJava;

public class Day96 {

    public static void main(String[] args) {
        // Asterisk Pattern : Diamond

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
        for (int i = tinggi - 1; i >= 1; i--) {
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
