package skipGenerator;

import countingGenerator.CountingGenerator;
import generator.interfaces.Generator;

public class SkipGenerator {
    public static class
    Boolean implements Generator<java.lang.Boolean> {
        private int skip;
        private boolean value = false;
        public Boolean(int n) {
            skip = n;
        }
        public java.lang.Boolean next() {
            value = !value; // Just flips back and forth
            return value;
        }
    }
    public static class
    Byte implements Generator<java.lang.Byte> {
        private byte value;
        public Byte(byte n) {
            value = n;
        }
        public java.lang.Byte next() { return value++; }
    }
    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    public static class
    Character implements Generator<java.lang.Character> {
        int index;
        public Character(int n) {
            index = n;
        }
        public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }
    public static class
    String implements Generator<java.lang.String> {
        private int length = 7;
        private int skip;
        public String(int n, int length) {
            skip = n;
            this.length = length;
        }
        Generator<java.lang.Character> cg = new SkipGenerator.Character(skip);
        public java.lang.String next() {
            char[] buf = new char[length];
            for(int i = 0; i < length; i++)
                buf[i] = cg.next();
            return new java.lang.String(buf);
        }
    }
    public static class
    Short implements Generator<java.lang.Short> {
        private short value;
        public Short(short n) {
            value = n;
        }
        public java.lang.Short next() { return value++; }
    }
    public static class
    Integer implements Generator<java.lang.Integer> {
        private int value;
        public Integer(int n) {
            value = n;
        }
        public java.lang.Integer next() { return value++; }
    }
    public static class
    Long implements Generator<java.lang.Long> {
        private long value;
        public Long(long n) {
            value = n;
        }
        public java.lang.Long next() { return value++; }
    }
    public static class
    Float implements Generator<java.lang.Float> {
        private float value;
        public Float(float n) {
            value = n;
        }
        public java.lang.Float next() {
            float result = value;
            value += 1.0;
            return result;
        }
    }
    public static class
    Double implements Generator<java.lang.Double> {
        private double value;
        public Double(double n) {
            value = n;
        }
        public java.lang.Double next() {
            double result = value;
            value += 1.0;
            return result;
        }
    }
}
