package models;

public class MyClass implements Comparable<MyClass> {
    private int value;
    public MyClass(int value) {
        this.value = value;
    }
    @Override
    public int compareTo(MyClass o) {
        return this.value - o.value;

    }
    @Override
    public String toString() {
        return "" + value;
    }
}