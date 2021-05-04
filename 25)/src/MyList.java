import java.util.ArrayList;
import java.util.List;

public class MyList extends ArrayList<Integer> {
    public MyList(List list) {
        super(list);
    }
    public List getReversed() {
        List<Integer> list = new ArrayList<>(this.size()-1);
        for(int i = 0; i < this.size(); i++) {
            list.add(this.get(this.size() - i - 1));
        }
        return list;
    }
}
