package SeratusHariJava;

import java.util.Scanner;

public class Day97 {

    public static void main(String[] args) {
        // Soal : Mencetak bilangan prima dari 1-n
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + n + " adalah:");

        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    prima = false;
                    break;
                }

            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
