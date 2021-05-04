package berylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {
    public static BerylliumSphere[][] newArray(int rows, int columns) throws IllegalArgumentException {
        int max,min;
        if(rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            if(rows > columns) {
                max = rows;
                min = columns;
            }
            else {
                max = columns;
                min = rows;
            }
        }
        BerylliumSphere[][] arr = new BerylliumSphere[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr[i][j] = new BerylliumSphere();
            }
        }
        return arr;
    }
    public static void printArray(BerylliumSphere[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printArray(newArray(5,7));
        System.out.println();
        printArray(newArray(7,7));
    }
}
