package SeratusHariJava;

public class Day90 {
    public static void main(String[] args) {
        double[] nilai = new double[]{91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] > max) {
                max = nilai[i];
            }
            if(nilai[i] < min) {
                min = nilai[i];
            }
            sum += nilai[i];
        }
        
        double avg = sum / nilai.length;
        
        System.out.println("DATA MIN: "+min);
        System.out.println("DATA MAX: "+max);
        System.out.println("DATA SUM: "+sum);
        System.out.println("DATA AVG: "+avg);
        
        
    }
}
