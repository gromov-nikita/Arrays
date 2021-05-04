package models;

public class MyClass implements Comparable<MyClass> {
    private int value;
    public MyClass(int value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        return this.value == ((MyClass)o).value;
    }
    @Override
    public int compareTo(MyClass o) {
        return this.value > o.value ? 1 : -1;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}