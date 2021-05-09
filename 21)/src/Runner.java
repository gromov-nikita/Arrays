import models.BerylliumSphere;

import java.util.Arrays;
import java.util.Comparator;

/*
Exercise 21: (3) Try to sort an array of the objects in Exercise 18. Implement
Comparable to fix the problem. Now create a Comparator to sort the objects into reverse
order.
 */
public class Runner  {
    public static void main(String[] args) {
        BerylliumSphere[] arr = new BerylliumSphere[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (BerylliumSphere o1, BerylliumSphere o2) -> (int) (o1.getId() - o2.getId()));
        System.out.println(Arrays.toString(arr));
    }
}
