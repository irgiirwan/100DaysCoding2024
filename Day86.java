package SeratusHariJava;

public class Day86 {
    public static void main(String[] args) {
        // Mencetak elemen pada Array satu dimensi 
        
        int angka[] = new int[]{1,2,3,4,5};
        
        // perulangan for
        for (int i = 0; i < angka.length; i++) {
             System.out.print(angka[i]+" ");
        }
        System.out.println("");
        
        // perulangan for each
        for (int agk : angka) {
             System.out.print(agk+" ");
        }
        System.out.println("");
        
        // perulangan while
        int i = 0;
        while (i < angka.length){
            System.out.print(angka[i]+" ");
            i++;
        }
        System.out.println("");
        
        // perulangan do while
        int j = 0;
        do {
            System.out.print(angka[j]+" ");
            j++;
        }while (j < angka.length);
        System.out.println("");
    }
}
