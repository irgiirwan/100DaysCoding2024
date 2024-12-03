package SeratusHariJava;

public class Day93 {
    public static void main(String[] args) {
        // Asterisk Pattern : Pola V Terbalik
        
        int tinggi = 5;
        for(int i = tinggi; i > 0; i--) {
            for (int j = 0; j < (2 * tinggi - 1); j++) {
                if(j == i - 1 || j == (2 * tinggi - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println("");
        }
        
    }
}
