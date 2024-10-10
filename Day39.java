package SeratusHariJava;

public class Day39 {

    public static void main(String[] args) {
        //Tugas Operator Penugasan : Pengisian dan Modulo
        
        int nilai = 15, nilaiBagi = 4, nilaiPertama = nilai; // Pengisian Nilai
        
        System.out.println("Hasil Pengisian : "+nilai);
        
        nilai %= nilaiBagi; // Pengisian dan Modulo
        System.out.println("");
        System.out.println("Proses Modulo nilai");
        System.out.println("Sisa bagi dari "+nilaiPertama+"/"+nilaiBagi+" : "+nilai);
    }
}
