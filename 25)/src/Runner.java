import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Exercise 25: (3) Rewrite PythonLists.py in Java.
 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        System.out.println(list.get(4));
        list.addAll(Arrays.asList(new Integer[]{6, 7}));
        System.out.println(list.toString());
        List<Integer> subList = list.subList(2,4);
        System.out.println(subList.toString());
        List<Integer> list2 = new MyList(list);
        System.out.println(list.toString());
        System.out.println(((MyList)list2).getReversed().toString());
    }
}
