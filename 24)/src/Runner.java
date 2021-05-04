import models.MyClass;

import java.util.Arrays;

/*
Exercise 24: (3) Show that the class from Exercise 19 can be searched.

Exercise 19: (2) Create a class with an int field that’s initialized from a constructor
argument. Create two arrays of these objects, using identical initialization values for each
array, and show that Arrays.equals( ) says that they are unequal. Add an equals( )
method to your class to fix the problem.
 */
public class Runner {
    public static void main(String[] args) {
        MyClass[] arr = {
                new MyClass(0),
                new MyClass(1),
                new MyClass(2),
                new MyClass(3),
                new MyClass(4),
                new MyClass(5),
                new MyClass(6),
                new MyClass(7),
                new MyClass(8),
                new MyClass(9)
        };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,new MyClass(5)));
    }
}
