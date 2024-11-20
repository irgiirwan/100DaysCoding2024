package SeratusHariJava;

public class Day80 {
    public static void main(String[] args) {
        // String Method : trim()
        
        String kalimat = "     Namun Pintunya Masih Terkunci dan Kuncinya Rusak     ";
        String makeTrim = kalimat.trim();
        
        System.out.println("Sebelum trim() : "+kalimat);
        System.out.println("Setelah trim() : "+makeTrim);
    }
}
