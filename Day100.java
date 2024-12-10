package SeratusHariJava;

import java.util.Scanner;
import java.time.LocalTime;

public class Day100 {

    public static void main(String[] args) {
        // Soal Deskripsi : Buatlah program Java yang meminta pengguna untuk memasukkan nama mereka, kemudian memberikan salam berdasarkan waktu saat ini.

        Scanner sc = new Scanner(System.in);
        System.out.print("Silahkan Masukkan Nama Anda: ");
        String nama = sc.nextLine();
        
        LocalTime waktuSaatIni = LocalTime.now();
        int jamSaatIni = waktuSaatIni.getHour();
        
        String salam = "";
        
        if(jamSaatIni < 12) {
            salam = "Selamat pagi";
        } else if(jamSaatIni < 17) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }
                      
        System.out.println("══════════════════════════════════════════");
        System.out.printf("\t %s, %s %n",salam,nama);
        System.out.printf("\t Program Anda Telah Selesai %n");
        System.out.println("══════════════════════════════════════════");
    }
}
