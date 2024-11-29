
package SeratusHariJava;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anggota Gym: ");
        String Nama = scanner.nextLine();
        
        System.out.print("Masukkan Umur Anggota Gym: ");
        int Umur = scanner.nextInt();
        
        System.out.print("Apakah Anda Bagian Dari Anggota Gym? (true/false): ");
        boolean StatusKeanggotaan  = scanner.nextBoolean();
        
        System.out.println("\nData Profile");
        System.out.printf("Nama: %s%n", Nama);
        System.out.printf("Umur: %d%n", Umur);
        System.out.printf("Status Keanggotaan: %s%n", StatusKeanggotaan ? "Member" : "Non-member");
        
        if(Umur > 18) {
            System.out.println("\"Selamat, Anda memenuhi syarat untuk keanggotaan premium.\"");
        } else {
            System.out.println("\"Maaf, Anda belum memenuhi syarat untuk keanggotaan premium.\"");
        }
    }
}

