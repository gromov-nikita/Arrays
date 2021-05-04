import countingGenerator.CountingGenerator;

import java.util.Arrays;

/*
Exercise 14: (6) Create an array of each primitive type, then fill each array by using
CountingGenerator. Print each array.
 */
public class Runner {
    public static void main(String[] args) {
        int size = 10;
        CountingGenerator.Byte aByte = new CountingGenerator.Byte();
        CountingGenerator.Boolean aBoolean = new CountingGenerator.Boolean();
        CountingGenerator.Character aCharacter = new CountingGenerator.Character();
        CountingGenerator.Short aShort = new CountingGenerator.Short();
        CountingGenerator.Integer  aInteger = new CountingGenerator.Integer();
        CountingGenerator.Long  aLong = new CountingGenerator.Long();
        CountingGenerator.Float  aFloat = new CountingGenerator.Float();
        CountingGenerator.Double  aDouble = new CountingGenerator.Double();
        byte[] arrByte = new byte[size];
        boolean[] arrBoolean = new boolean[size];
        char[] arrChar = new char[size];
        short[] arrShort = new short[size];
        int[] arrInteger = new int[size];
        long[] arrLong = new long[size];
        float[] arrFloat = new float[size];
        double[] arrDouble = new double[size];
        for(int i = 0; i < size; i++) {
            arrByte[i] = aByte.next();
            arrBoolean[i] = aBoolean.next();
            arrChar[i] = aCharacter.next();
            arrShort[i] = aShort.next();
            arrInteger[i] = aInteger.next();
            arrLong[i] = aLong.next();
            arrFloat[i] = aFloat.next();
            arrDouble[i] = aDouble.next();

        }
        System.out.println(Arrays.toString(arrByte));
        System.out.println(Arrays.toString(arrBoolean));
        System.out.println(Arrays.toString(arrChar));
        System.out.println(Arrays.toString(arrShort));
        System.out.println(Arrays.toString(arrInteger));
        System.out.println(Arrays.toString(arrLong));
        System.out.println(Arrays.toString(arrFloat));
        System.out.println(Arrays.toString(arrDouble));

    }
}
