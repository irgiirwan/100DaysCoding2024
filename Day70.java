package SeratusHariJava;

public class Day70 {
    // Method Parameter 

    public static int tambah(int a, int b) { 
        int hasil = a + b;
        return hasil; 
    }
    
    public static void main(String[] args) {
        int angka1 = 5;
        int angka2 = 10;
        int hasilPenjumlahan = tambah(angka1, angka2);
        
        System.out.println("Hasil dari penjumlahan: " + hasilPenjumlahan);
    
    }
}
