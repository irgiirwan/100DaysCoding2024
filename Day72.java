package SeratusHariJava;

import java.util.Scanner;

public class Day72 {
    // Method Rekursif  

     public static int angkanya(int n){
        if(n > 0){
            if(n != 1) {
                System.out.print(n+" x ");
            } else {
                System.out.print(n+" = ");
            }
            return n * angkanya(n - 1);
        }else{
            return 1;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka faktorial (!): ");
        int angka = input.nextInt();
        int hasil = angkanya(angka);
        System.out.println(hasil);
    }
}
