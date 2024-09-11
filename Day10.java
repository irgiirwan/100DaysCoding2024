package SeratusHariJava;
        
public class Day10 {
    public static void main(String[] args) {
        // Tugas penggunaan tipe data byte
        
        byte angka1 = -64; //min -128
        byte angka2 = 64;  //max 127
        
        System.out.println("Nilai angka pertama adalah "+angka1);
        System.out.println("Nilai angka kedua adalah "+angka2);
        
        // jika melewali batas angka min dan max pada tipe data byte maka akan menampilkan pesan error
        // angka1 = -129;
        // angka2 = 128;
    }
}
