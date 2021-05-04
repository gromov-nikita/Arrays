import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayOfGenerics {
    public static void main(String[] args) {
        List<ArrayList<String>> ls;
        List<ArrayList<String>> la = new ArrayList<>(10);
        ls = la; // "Unchecked" warning
        ls.add(new ArrayList<String>());
        // Compile-time checking produces an error:
        //! ls[1] = new ArrayList<Integer>();
        // The problem: List<String> is a subtype of Object


        //List<Object> objects = ls; // So assignment is OK


        // Compiles and runs without complaint:



        //objects.add(new ArrayList<Integer>());



        // However, if your needs are straightforward it is
        // possible to create an array of generics, albeit
        // with an "unchecked" warning:
        List<List<BerylliumSphere>> spheres = new ArrayList<>(10);
        for (int i = 0; i < spheres.size(); i++)
            spheres.add(new ArrayList<BerylliumSphere>());
    }
}
