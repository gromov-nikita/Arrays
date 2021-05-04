import java.util.Arrays;

/*
Exercise 22: (2) Show that the results of performing a binarySearch( ) on an unsorted
array are unpredictable.
 */
public class Runner {
    public static void main(String[] args) {
        Integer[] arr =  {
            1,9,2,4,6,3,5,8,7,0
        };
        System.out.println(Arrays.binarySearch(arr,0));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,2));
    }
}
