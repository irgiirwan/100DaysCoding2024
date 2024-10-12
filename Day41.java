package SeratusHariJava;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        // Tugas ngoding

        // Input dari Keyboard (34)
        System.out.println("Input dari Keyboard (34)");
        Scanner input = new Scanner(System.in);

        int nilaiA, nilaiB, nilaiC;

        System.out.print("Masukan Nilai A :");
        nilaiA = input.nextInt();
        System.out.print("Masukan Nilai B :");
        nilaiB = input.nextInt();
        System.out.println("");
        // Tipe data reference Boolean (28) dan operator perbandingan lebih kecil lebih besar (40)
        System.out.println("Tipe data reference Boolean (28) dan operator perbandingan lebih kecil lebih besar (40)");
        System.out.println("Apakah " + nilaiA + " > " + nilaiB + " : " + (nilaiA > nilaiB));
        System.out.println("Apakah " + nilaiA + " < " + nilaiB + " : " + (nilaiA < nilaiB));
        System.out.println("");

        // operator aritmatika penjumlahan, pengurangan, perkalian, pembagian, modulo (35 dan 36)
        System.out.println("operator aritmatika penjumlahan, pengurangan, perkalian, pembagian, modulo (35 dan 36)");
        System.out.println("Hasil dari " + nilaiA + " + " + nilaiB + " = " + (nilaiA + nilaiB));
        System.out.println("Hasil dari " + nilaiA + " - " + nilaiB + " = " + (nilaiA - nilaiB));
        System.out.println("Hasil dari " + nilaiA + " x " + nilaiB + " = " + (nilaiA * nilaiB));
        System.out.println("Hasil dari " + nilaiA + " / " + nilaiB + " = " + (nilaiA / nilaiB));
        System.out.println("Sisa bagi dari " + nilaiA + " / " + nilaiB + " = " + (nilaiA % nilaiB));
        System.out.println("");

        //Tugas Konversi Tipe Data Primitif String (32)
        System.out.println("Tugas Konversi Tipe Data Primitif String (32)");
        String AngStr1 = String.valueOf(nilaiA);
        String AngStr2 = String.valueOf(nilaiB);
        System.out.println("nilainya adalah: " + (AngStr1+AngStr2));
        System.out.println("");
        
        //Tipe Data reference BigInteger (29) dan tipe data reference BigDecimal (30)
        System.out.println("Tipe Data reference BigInteger (29) dan tipe data reference BigDecimal (30)");
        BigInteger nilaiBigInteger = new BigInteger(AngStr1);
        BigDecimal nilaiBigDecimal = new BigDecimal(AngStr2);
        System.out.println("nilainya adalah: " + (nilaiBigInteger));
        System.out.println("nilainya adalah: " + (nilaiBigDecimal));
        System.out.println("");
        
        //Konversi String ke Tipe Data Primitif (31)
        System.out.println("Konversi String ke Tipe Data Primitif (31)");
        int AngInt1 = Integer.parseInt(AngStr1);
        int AngInt2 = Integer.parseInt(AngStr2);
        System.out.println("nilainya adalah: " + (AngInt1+AngInt2));
        System.out.println("");

        // type casting (33)
        System.out.println("type casting (33)");
        System.out.println("Nilai A Sebelum: " + nilaiA);
        System.out.println("Nilai B Sebelum: " + nilaiB);

        nilaiC = nilaiA;
        nilaiA = nilaiB;
        nilaiB = nilaiC;

        System.out.println("Nilai A Setelah: " + nilaiA);
        System.out.println("Nilai B Setelah: " + nilaiB);
        System.out.println("");

        // operator penugasan pengisian nilai, pengisian dan penammbahan, pengisian dan pengurangan,
        // pengisian dan perkalian, pengisian dan pembagian, pengisian dan modulo (37, 38, dan 39)
        System.out.println("operator penugasan pengisian nilai, pengisian dan penammbahan, pengisian dan pengurangan, pengisian dan perkalian, pengisian dan pembagian, pengisian dan modulo (37, 38, dan 39)");
        System.out.println("Hasil dari " + nilaiA + " + 2 = " + (nilaiA += 2));
        System.out.println("Hasil dari " + nilaiA + " - 2 = " + (nilaiA -= 2));
        System.out.println("Hasil dari " + nilaiA + " x 2 = " + (nilaiA *= 2));
        System.out.println("Hasil dari " + nilaiA + " / 2 = " + (nilaiA /= 2));
        System.out.println("Sisa bagi dari " + nilaiA + " / 2 = " + (nilaiA %= 2));
        System.out.println("");
    }
}
