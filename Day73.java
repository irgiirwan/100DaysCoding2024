package SeratusHariJava;

public class Day73 {
    // String Method : charAt()
    
    public static void main(String[] args) {
        String kata = "Tunjukkan Sekarang";
        
        char karakterPertama = kata.charAt(0);
        char karakterKedua = kata.charAt(1);
        char karakterTerakhir = kata.charAt(kata.length() - 1);

        System.out.println("Karakter pertama: " + karakterPertama);
        System.out.println("Karakter kedua: " + karakterKedua);
        System.out.println("Karakter terakhir: " + karakterTerakhir);
    }
}
