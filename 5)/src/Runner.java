/*
Exercise 5: (1) Demonstrate that multidimensional arrays of nonprimitive types are
automatically initialized to null.
 */
public class Runner {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[4][4];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
