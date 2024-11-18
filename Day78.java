package SeratusHariJava;

import java.util.Scanner;

public class Day78 {
    // String Method : equalsIgnoreCase()
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Kata Sandi Anda: ");
        String input_pw = input.nextLine();
        
        String password = "Buka Pintumu";
        
        if(password.equalsIgnoreCase(input_pw)) {
            System.out.println("Akses Diterima!");
            System.out.println("Welcome and enter your world.");
        } else {
            System.out.println("Akses Ditolak! try one more time.");
        }
        
    }
}
