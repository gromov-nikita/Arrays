import countingGenerator.CountingGenerator;

import java.util.Arrays;

/*
Exercise 12: (1) Create an initialized array of double using CountingGenerator. Print
the results.
 */
public class Runner {
    public static void main(String[] args) {
        CountingGenerator.Double obj = new CountingGenerator.Double();
        int size = 10;
        double[] arr = new double[size];
        for(int i = 0; i < 10; i++) {
            arr[i] = obj.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
