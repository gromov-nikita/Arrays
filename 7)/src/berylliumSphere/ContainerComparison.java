package berylliumSphere;

public class ContainerComparison {
    public static BerylliumSphere[][][] newArray(int layers, int rows, int columns) throws IllegalArgumentException{
        int max,min;
        if(layers <= 0 || rows <= 0 || columns <= 0) {
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
        BerylliumSphere[][][] arr = new BerylliumSphere[layers][rows][columns];
        for(int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    arr[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return arr;
    }
    public static void printArray(BerylliumSphere[][][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    System.out.print(arr[i][j][k] + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printArray(newArray(5,5,5));
        System.out.println();
        printArray(newArray(2,4,3));
    }
}
