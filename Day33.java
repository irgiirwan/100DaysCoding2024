package SeratusHariJava;

public class Day33 {

    public static void main(String[] args) {
        //Tugas Type Casting

        byte nilaiByte1 = 10;
        long nilaiLong1 = nilaiByte1;  // Widening casting proses otomatis konversi dari kapasitas kecil ke yang besar
        System.out.println("Nilai Long: " + nilaiLong1);
        
        long nilaiLong2 = 100;
        byte nilaiByte2 = (byte) nilaiLong2;  // Narrowing Casting proses konversi dari kapasitas besar ke yang kecil secara manual
        System.out.println("Nilai Byte: " + nilaiByte2);
    }
}
