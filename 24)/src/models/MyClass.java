package models;

public class MyClass implements Comparable<MyClass> {
    private int value;
    public MyClass(int value) {
        this.value = value;
    }
    @Override
    public int compareTo(MyClass o) {
        if(this.value == o.value) {
            return 0;
        }
        else {
            return this.value > o.value ? 1 : -1;
        }
    }
    @Override
    public String toString() {
        return "" + value;
    }
}