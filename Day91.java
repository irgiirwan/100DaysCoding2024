package SeratusHariJava;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        // Soal Percabangan : You and I, end 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan Angka Genap: ");
            int angka = sc.nextInt();
            if(angka % 2 == 0) {
                continue;
            } else {
                System.out.println("You and I, end");
                break;
            }
        }
        
    }
}
