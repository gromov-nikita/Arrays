/*
Exercise 18: (3) Create and fill an array of BerylliumSphere. Copy this array to a new
array and show that it’s a shallow copy.
 */

import berylliumSphere.BerylliumSphere;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        BerylliumSphere[] arr = new BerylliumSphere[10];
        Arrays.fill(arr,new BerylliumSphere());
        System.out.println(Arrays.toString(arr));
        BerylliumSphere[] arrCopy = new BerylliumSphere[10];
        System.arraycopy(arr,0,arrCopy,0,arr.length);
        System.out.println(Arrays.toString(arrCopy));
    }
}
