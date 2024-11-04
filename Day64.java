package SeratusHariJava;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // keluar dari loop luar
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("Loop selesai.");
    }
}
