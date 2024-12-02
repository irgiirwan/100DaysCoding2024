package SeratusHariJava;

public class Day92 {
    public static void main(String[] args) {
        // Asterisk Pattern : Pola V
        
        int tinggi = 5;
        for(int i = 0; i < tinggi; i++) {
            for (int j = 0; j < (2 * tinggi -1); j++) {
                if(j == i || j == (2 * tinggi - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println("");
        }
        
    }
}
