package models;

public class BerylliumSphere implements Comparable<BerylliumSphere>{
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Sphere " + id; }
    public long getId() {
        return id;
    }
    @Override
    public int compareTo(BerylliumSphere o) {
        return (int) (o.id - this.id);
    }
}
