package SeratusHariJava;

public class Day69 {
    // Tugas: buat sebuah program,  buat array dengan elemen "nama","nim","angkatan" tampilkan menggunakan for each

    public static void main(String[] args) {
        String biodata[] = {
            "Nama    : A. Irgi Irwan. A",
            "NIM     : D0224318",
            "Angkatan: D0224318"
        };
        
        for(String data : biodata) {
            System.out.println(data);
        }
    }
}
