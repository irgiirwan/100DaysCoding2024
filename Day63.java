package SeratusHariJava;

public class Day63 {

    public static void main(String[] args) {
        // Keyword : continue
        
        int j = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0) {
                continue;
            }
            j += 1;
            System.out.println(j+" x 5 = " + i);
        }

    }
}
