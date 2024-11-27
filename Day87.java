package SeratusHariJava;

public class Day87 {
    public static void main(String[] args) {
        // Mencetak elemen pada Array satu dimensi 
        
        int angka[] = new int[]{1,2,3,4,5};
        
        // sebelum ubah elemen indeks 3
        for (int i = 0; i < angka.length; i++) {
             System.out.print(angka[i]+" ");
        }
        System.out.println("");
        
        angka[3] = 6;
        
        // setelah ubah elemen indeks 3
        for (int agk : angka) {
             System.out.print(agk+" ");
        }
        System.out.println("");
    }
}
