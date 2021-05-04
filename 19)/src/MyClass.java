import java.util.Objects;

public class MyClass {
    private int value;
    public MyClass(int value) {
        this.value = value;
    }
    public boolean equalsMyclass(MyClass o) {
        return this.value == o.value;
    }

}
