package SeratusHariJava;
import java.util.Scanner;
public class Day34 {

    public static void main(String[] args) {
        //Tugas Input dari keyboard
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukan NIM Anda: ");
        String nim = input.next();
        
        System.out.println("");
        System.out.println("Give me a second...");
        System.out.println("");
        
        System.out.println("Nama: "+nama);
        System.out.println("NIM : "+nim);
    }
}
