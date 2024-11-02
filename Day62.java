package SeratusHariJava;

public class Day62 {

    public static void main(String[] args) {
        // Keyword : break
        
        int i = 1;
        while(i <= 10) {
            System.out.println("Angka Ke-"+i);
            if(i >= 5) {
                break;
            }
            i++;
        }
    }
}
