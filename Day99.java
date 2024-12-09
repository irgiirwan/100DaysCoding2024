package SeratusHariJava;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        // Soal : Kalkulator sederhana
        
        Scanner sc = new Scanner(System.in);
        double x = 0, y = 0, hasil = 0;
        boolean valid = false;
        char operasi = 0;

        while (!valid) {
            System.out.print("Masukkan Angka Pertama: ");
            x = sc.nextInt();
            System.out.print("Masukkan Angka Kedua: ");
            y = sc.nextInt();
            ulangOperasi:
            System.out.print("Pilih Operasi (+, -, *, /): ");
            operasi = sc.next().charAt(0);

            switch (operasi) {
                case '+':
                    hasil = x + y;
                    valid = true;
                    break;
                case '-':
                    hasil = x - y;
                    valid = true;
                    break;
                case '*':
                    hasil = x * y;
                    valid = true;
                    break;
                case '/':
                    hasil = x / y;
                    valid = true;
                    break;
                default:
                    System.out.println("Operasi tidak valid");
            }
        }
        
        switch (operasi) {
                case '+':
                    System.out.println("Hasil dari "+x+" + "+y+" = "+hasil);
                    break;
                case '-':
                    System.out.println("Hasil dari "+x+" - "+y+" = "+hasil);
                    break;
                case '*':
                    System.out.println("Hasil dari "+x+" * "+y+" = "+hasil);
                    break;
                case '/':
                    System.out.println("Hasil dari "+x+" / "+y+" = "+hasil);
                    break;
            }
    }
}
