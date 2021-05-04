import berylliumSphere.BerylliumSphere;

import java.util.Arrays;

/*
Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an
argument. Call the method, creating the argument dynamically. Demonstrate that ordinary
aggregate array initialization doesn’t work in this case. Discover the only situations where
ordinary aggregate array initialization works, and where dynamic aggregate initialization is
redundant.
 */
public class Runner {
    public static void printArray(BerylliumSphere[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        printArray(new BerylliumSphere[]{
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()});
        BerylliumSphere[] d = {
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()
        };
        printArray(d);
    }
}
