package berylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {
    public static BerylliumSphere[] newArray(int size) {
        BerylliumSphere[] arr = new BerylliumSphere[size];
        for(int i = 0; i < size; i++) {
            arr[i] = new BerylliumSphere();
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArray(10)));
    }
}
