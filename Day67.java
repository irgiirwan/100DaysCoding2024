package SeratusHariJava;

public class Day67 {
    // Method void
    
    public static void tampilPesan() {
        System.out.println("Halo, ini adalah pesan dari method void!");
    }

    public static void tampilPerkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil perkalian " + a + " dan " + b + " adalah: " + hasil);
    }
    
    public static void main(String[] args) {
        
        Day67.tampilPesan();
        
        Day67.tampilPerkalian(3, 4);
    }
}
