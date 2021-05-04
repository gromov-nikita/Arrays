import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
Exercise 23: (2) Create an array of Integer, fill it with random int values (using
autoboxing), and sort it into reverse order using a Comparator.
 */
public class Runner {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] arr = new Integer[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
