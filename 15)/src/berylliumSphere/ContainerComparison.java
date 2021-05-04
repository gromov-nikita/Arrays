package berylliumSphere;

import countingGenerator.CountingGenerator;
import generator.Generated;
import generator.interfacee.Generator;

public class ContainerComparison {
    public static void main(String[] args) {
        CountingGenerator.BerylliumSphere obj = new CountingGenerator.BerylliumSphere();
        BerylliumSphere[] arr = new BerylliumSphere[3];
        arr[0] = obj.next();
        arr[1] = obj.next();
        arr[2] = obj.next();
        for(int i = 0; i < 3; i++) {
            System.out.println(arr[i].toString());
        }
        BerylliumSphere[] arr2 = Generated.array(arr,obj);
        for(int i = 0; i < 3; i++) {
            System.out.println(arr2[i].toString());
        }


    }
}
