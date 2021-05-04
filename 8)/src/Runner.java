import java.util.Arrays;

/*
Exercise 8: (1) Demonstrate the assertions in the previous paragraph

Erasure gets in the way again—this example attempts to create arrays of types that have been
erased, and are thus unknown types. Notice that you can create an array of Object, and cast
it, but without the @SuppressWarnings annotation you get an "unchecked" warning at
compile time because the array doesn’t really hold or dynamically check for type T. That is, if
I create a String[], Java will enforce at both compile time and run time that I can only place
String objects in that array. However, if I create an Object[], I can put anything into that
array except primitive types..
 */
public class Runner {
    public static void main(String[] args) {
        Object[] arr = new Object[5];
        arr[0] = "String";
        arr[1] = 'q';
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9.3454;
        System.out.println(Arrays.toString(arr));
    }
}
