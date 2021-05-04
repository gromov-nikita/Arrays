import java.util.Arrays;

/*
Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional arrays.
 */
public class Runner {
    public static void main(String[] args) {
        Integer [][][] arr1 = new Integer[3][4][5];
        Integer [][][] arr2 = new Integer[3][4][5];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                for(int k = 0; k < arr1[0][0].length; k++) {
                    arr1[i][j][k] = 1;
                    arr2[i][j][k] = 1;
                }
            }
        }
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.deepEquals(arr1,arr2));

    }
}
