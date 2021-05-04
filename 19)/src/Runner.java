/*
Exercise 19: (2) Create a class with an int field that’s initialized from a constructor
argument. Create two arrays of these objects, using identical initialization values for each
array, and show that Arrays.equals( ) says that they are unequal. Add an equals( )
method to your class to fix the problem.
 */
public class Runner {
    public static void main(String[] args) {
        MyClass[] arr1 = {
                new MyClass(1),
                new MyClass(1),
                new MyClass(1),
                new MyClass(1),
                new MyClass(1)};
        MyClass[] arr2 = {
                new MyClass(1),
                new MyClass(1),
                new MyClass(1),
                new MyClass(1),
                new MyClass(1)};
        System.out.println(arr1[0].equals(arr2[1]));
        System.out.println(arr1[0].equalsMyclass(arr2[1]));
    }
}
