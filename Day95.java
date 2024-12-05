package SeratusHariJava;

public class Day95 {

    public static void main(String[] args) {
        // Asterisk Pattern : Segitiga Siku dan sebaliknya

        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = tinggi; i >= 1; i--) {
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
