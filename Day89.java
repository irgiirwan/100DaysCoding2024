package SeratusHariJava;

public class Day89 {
    public static void main(String[] args) {
        int[] nilai = new int[]{85, 90, 78, 88, 92};
        
        System.out.print("nilai sebelum pembaruan: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+" ");
        }
        System.out.println("");
        
        nilai[3] = 89;
        
        System.out.print("nilai sesudah pembaruan: ");
        for (int skor : nilai) {
            System.out.print(skor+" ");
        }
        System.out.println("");
        
        double total = 0;
        for(int skor : nilai) {
            total += skor;
        }
        double rata2 = total / nilai.length;
        System.out.printf("\nRata-rata Nilai Ujian: %.2f%n", rata2);
    }
}

