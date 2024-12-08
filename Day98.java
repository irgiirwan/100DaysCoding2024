package SeratusHariJava;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
      // Soal : Total penjumlahan bilangan genap dari x ke y
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Angka awal: ");
        int x = sc.nextInt();
        System.out.print("Angka akhir: ");
        int y = sc.nextInt();
        int t = 0;
        
        for(int i = x; i <= y; i++) {
            if(i % 2 == 0) {
                t += i;
                if(i == y) {
                    System.out.print(i + " = ");
                } else {
                    System.out.print(i + " + ");
                }
            }
        }
        System.out.print(t);
        System.out.println("");
    }
}
